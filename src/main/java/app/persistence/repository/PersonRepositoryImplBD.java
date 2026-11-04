package app.persistence.repository;

import app.domain.Person;
import app.persistence.mapper.RowMapper;
import app.service.outputports.PersonRepositoryInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepositoryImplBD implements PersonRepositoryInterface {


    private final Connection connection;
    private final RowMapper rowMapper;


    public PersonRepositoryImplBD(Connection connection,RowMapper rowMapper ){
        this.connection = connection;
        this.rowMapper = rowMapper;
    }

    @Override
    public Person savePerson(Person person) {


    String sql = "INSERT INTO person (id, name , last_name, document_type, email, password_person , state , occupation , salary) VALUES (?,?,?,?,?,?,?,?,?)";

    try(PreparedStatement ps= connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){

        setPersonParams(ps, person);
        ps.executeUpdate();


        System.out.println("Se guardo en la db");

    }catch (SQLException e){
        throw  new RuntimeException("Error al guardar Persona" + e.getMessage());
    }
        return person;
    }

    @Override
    public Optional<Person> selectPersonById(int id) {

        String sql = "SELECT * FROM person WHERE id = ?";

        try(PreparedStatement ps = connection.prepareStatement(sql)){

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                return Optional.of((Person) rowMapper.mapRow(rs));
            }

        }catch (SQLException e){
            throw new RuntimeException("No fue posible consultar el cliente con id" + id + "Mensaje: " + e.getMessage());
        }

        return Optional.empty();
    }

    @Override
    public List<Person> selectAllPersons() {

        List<Person> persons = new ArrayList<>();

        String sql = "SELECT * FROM person";

        try(PreparedStatement ps = connection.prepareStatement(sql)){

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                persons.add((Person) rowMapper.mapRow(rs));
            }

        }catch (SQLException e){

            throw new RuntimeException("Error al consultar personas " + e.getMessage());
        }

        return persons;
    }

    @Override
    public Person updatePerson(int id, Person person) {

        String sql = """ 
                UPDATE person
                SET id = ? , name=?, last_name = ? , document_type=? , email=? , password_person=? ,state=?, occupation=?, salary=?
                WHERE id = ?
                """;

        try(PreparedStatement ps = connection.prepareStatement(sql)){

            setPersonParams(ps, person);

            ps.setInt(10, person.getId());

            ps.executeUpdate();

        }catch (SQLException e){
            throw new RuntimeException("No se pudo actualizar cliente con id " + id + "Mensaje" + e.getMessage());
        }

        return person;
    }

    @Override
    public void deletePerson(int id) {

        String sql = "DELETE from person WHERE id = ?";

        try(PreparedStatement ps = connection.prepareStatement(sql)){

            ps.setInt(1, id);
            int rows = ps.executeUpdate();


        }catch (SQLException e){
            throw new RuntimeException("Error al borrar usuario " + id + "Mensaje " + e.getMessage());
        }
    }


    public void setPersonParams(PreparedStatement ps , Person person) throws SQLException{

        ps.setInt(1, person.getId());
        ps.setString(2, person.getName());
        ps.setString(3, person.getLastName());
        ps.setString(4, person.getDocumentType());
        ps.setString(5, person.getEmail());
        ps.setString(6, person.getPassword());
        ps.setString(7, person.isState());
        ps.setString(8, person.getOccupation());
        ps.setDouble(9, person.getSalary());

    }



}

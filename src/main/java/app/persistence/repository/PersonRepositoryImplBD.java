package app.persistence.repository;

import app.domain.Person;
import app.service.outputports.PersonRepositoryInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PersonRepositoryImplBD implements PersonRepositoryInterface {


    private final Connection connection;


    public PersonRepositoryImplBD(Connection connection){
        this.connection = connection;
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







        return null;
    }

    @Override
    public Person selectPersonById(int id) {
        return null;
    }

    @Override
    public List<Person> selectAllPersons() {
        return List.of();
    }

    @Override
    public Person updatePerson(Person person) {
        return null;
    }

    @Override
    public void deletePerson(int id) {

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

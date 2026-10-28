package app.persistence.mapper;

import app.domain.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person>{

    @Override
    public Person mapRow(ResultSet rs) throws SQLException {

        Person person = new Person();

        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setLastName(rs.getString("last_name"));
        person.setDocumentType(rs.getString("document_type"));
        person.setEmail(rs.getString("email"));
        person.setPassword(rs.getString("password_person"));
        person.setState(rs.getString("state"));
        person.setOccupation(rs.getString("occupation"));
        person.setSalary(rs.getDouble("salary"));

        return person;
    }
}

package app.service.outputports;

import app.domain.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepositoryInterface {


    Person savePerson(Person person);
    Optional<Person> selectPersonById(int id);
    List<Person> selectAllPersons();
    Person updatePerson(int id, Person person);
    void deletePerson(int id);

}

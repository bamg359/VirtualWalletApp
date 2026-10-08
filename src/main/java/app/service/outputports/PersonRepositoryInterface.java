package app.service.outputports;

import app.domain.Person;

import java.util.List;

public interface PersonRepositoryInterface {


    Person savePerson(Person person);
    Person selectPersonById(int id);
    List<Person> selectAllPersons();
    Person updatePerson(Person person);
    void deletePerson(int id);

}

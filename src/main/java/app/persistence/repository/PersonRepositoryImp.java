package app.persistence.repository;

import app.domain.Person;
import app.service.outputports.PersonRepositoryInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonRepositoryImp implements PersonRepositoryInterface {


    List<Person> persons = new ArrayList<>( Arrays.asList(
            new Person(1, "John", "Doe", "cedula", "john.doe@example.com", "12345678" , "Activo", "Dev" , 40000000.00)
    ));


    @Override
    public Person savePerson(Person person) {

        persons.add(person);

        return person;
    }

    @Override
    public Optional<Person> selectPersonById(int id) {
        Person person  = persons.get(id);
        return Optional.ofNullable(person);
    }

    @Override
    public List<Person> selectAllPersons() {
        return persons;
    }

    @Override
    public Person updatePerson(int id, Person person) {
        persons.set(persons.indexOf(person), person);
        return person;
    }


    @Override
    public void deletePerson(int id) {

    }
}

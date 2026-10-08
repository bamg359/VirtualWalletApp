package app.service;

import app.domain.enums.DocumentTypeEnum;
import app.domain.Person;
import app.service.inputports.PersonUseCase;
import app.service.outputports.PersonRepositoryInterface;

import java.util.List;

public class PersonServiceImpl implements PersonUseCase {

    private final PersonRepositoryInterface personRepository;

    public PersonServiceImpl(PersonRepositoryInterface personRepository) {
        this.personRepository = personRepository;
    }


    @Override
    public Person createPerson(Integer id, String name, String lastName, String documentType, String email, String password, String isActive, String occupation, Double salary) {
        // Logic to create a new Person object
        Person person = new Person(id, name, lastName, documentType, email , password , isActive, occupation , salary );
        return person; // Placeholder return
    }


    public Person getPersonById(Integer id) {
        // Logic to retrieve a Person by ID
        Person person = personRepository.selectPersonById(id);
        return person;
    }

    public List<Person> getAllPersons() {
        // Logic to retrieve all Person objects
        return personRepository.selectAllPersons(); // Placeholder return
    }

    public Person updatePerson(Integer id, String name, String lastName, String documentType, String email, String password, String isActive, String occupation, Double salary) {
        // Logic to update an existing Person object
        Person person = new Person(id, name, lastName, documentType, email , password , isActive, occupation , salary );
        return personRepository.updatePerson(person); // Placeholder return
    }

    public void deletePerson(Integer id) {
        // Logic to delete a Person by ID
        personRepository.deletePerson(id);
    }




}

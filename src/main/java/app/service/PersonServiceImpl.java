package app.service;

import app.domain.DocumentTypeEnum;
import app.domain.Person;
import app.service.inputports.UserUseCase;

import java.util.List;

public class PersonServiceImpl implements UserUseCase {

    @Override
    public Person createPerson(Integer id, String name, String lastName, DocumentTypeEnum documentType, String email, String password, boolean isActive, String occupation, Double salary) {
        // Logic to create a new Person object
        return null; // Placeholder return
    }


    public Person getPersonById(Integer id) {
        // Logic to retrieve a Person by ID
        return null; // Placeholder return
    }

    public List<Person> getAllPersons() {
        // Logic to retrieve all Person objects
        return null; // Placeholder return
    }

    public Person updatePerson(Integer id, String name, String lastName, DocumentTypeEnum documentType, String email, String password, boolean isActive, String occupation, Double salary) {
        // Logic to update an existing Person object
        return null; // Placeholder return
    }

    public void deletePerson(Integer id) {
        // Logic to delete a Person by ID
    }




}

package app.service.inputports;

import app.domain.enums.DocumentTypeEnum;
import app.domain.Person;

import java.util.List;

public interface PersonUseCase {

    public Person createPerson(Integer id, String name, String lastName, String documentTypeEnum, String email, String password, String isActive, String occupation, Double salary);
    public Person getPersonById(Integer id);
    public List<Person> getAllPersons();
    public Person updatePerson(Integer id, String name, String lastName, String documentType, String email, String password, String isActive, String occupation, Double salary);
    public void deletePerson(Integer id);
}

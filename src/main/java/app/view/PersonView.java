package app.view;

import app.domain.enums.DocumentTypeEnum;
import app.service.helpers.SetDocumentType;
import app.service.helpers.SetPersonState;
import app.service.inputports.PersonUseCase;
import app.utils.FormRuleValidator;

public class PersonView {

    private final PersonUseCase personService;

    public PersonView(PersonUseCase personService){
        this.personService = personService;
    }

    public void createPerson(){

        int id = FormRuleValidator.validateInt("Ingrese el numero de id de la persona: ");
        String name = FormRuleValidator.validateString("Ingrese el nombre de la persona: ");
        String lastName = FormRuleValidator.validateString("Ingrese el apellido de la persona: ");
        String docType = SetDocumentType.getDocType();
        String email = FormRuleValidator.validateString("Ingrese el email");
        String password = FormRuleValidator.validateString("Ingrese una contraseña de al menos 8 caracteres que contenga Mayusculas, numeros y simbolos ");
        String state = SetPersonState.getPersonState();
        String occupation = FormRuleValidator.validateString("Ingrese la ocupación");
        double salary = FormRuleValidator.validateDouble("Ingrese su salario");





        personService.createPerson(id, name, lastName, docType, email , password , state , occupation , salary);





    }

    public void showPersons(){
        System.out.println("Showing persons");
    }


    public void showPersonById(){
        System.out.println("Getting person By Id");
    }

    public void updatePerson(){
        System.out.println("Updating person");
    }

    public void deletePerson(){
        System.out.println("Deleting person");
    }






}

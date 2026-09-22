package app.view;

import app.service.helpers.SetDocumentType;
import app.service.inputports.UserUseCase;
import app.utils.FormRuleValidator;

public class PersonView {

    private final UserUseCase personService;

    PersonView(UserUseCase personService){
        this.personService = personService;
    }

    public void createPerson(){

        int id = FormRuleValidator.validateInt("Ingrese el numero de id de la persona: ");
        String name = FormRuleValidator.validateString("Ingrese el nombre de la persona: ");
        String lastName = FormRuleValidator.validateString("Ingrese el apellido de la persona: ");
        String docType = SetDocumentType.getDocType();


        personService.createPerson(id, docType, name, lastName);





    }

    public void showPerson(){
        System.out.println("Showing person");
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

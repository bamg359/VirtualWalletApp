package app.userinterface;

import app.domain.Person;
import app.persistence.db.DataBaseConnection;
import app.persistence.mapper.PersonMapper;
import app.persistence.mapper.RowMapper;
import app.persistence.repository.AccountRepositoryImpl;
import app.persistence.repository.PersonRepositoryImp;
import app.persistence.repository.PersonRepositoryImplBD;
import app.service.AccountServiceImpl;
import app.service.PersonServiceImpl;
import app.service.inputports.AccountUseCase;
import app.service.inputports.PersonUseCase;
import app.service.outputports.AccountRepositoryInterface;
import app.service.outputports.PersonRepositoryInterface;
import app.utils.FormRuleValidator;
import app.view.AccountView;
import app.view.PersonView;

import java.sql.Connection;

public class AppUserInterface {

    private final PersonView personView;
    private final AccountView accountView;

    public AppUserInterface(PersonView personView ,AccountView accountView ){
        this.personView = personView;
        this.accountView = accountView;

    }


    public void startApp(){
        int init= FormRuleValidator.validateInt("Presione 1 para iniciar la aplicacion");
        do {
            DataBaseConnection.getInstance();
            int option = FormRuleValidator.validateInt("""
                1. Registro.
                2. Login.
                3. Salir.
                """);

            System.out.println("Bienvenido a la aplicacion de gestion de personas y cuentas");

            switch (option){
                case 1:
                    System.out.println("Registro de Persona");
                    personView.createPerson();
                    break;
                case 2:
                    System.out.println("Login");
                    menuApp();
                    break;
                case 3:
                    System.out.println("Salir");
                    init = 0;
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }

        }while(init != 0);
    }


    public void menuApp(){

        while(true){
            int option = FormRuleValidator.validateInt("""
                    1. Menu de personas.
                    2. Menu de cuentas.
                    """);

            switch (option){
                case 1:
                    System.out.println("Menu de personas");
                    personMenu();
                    break;
                case 2:
                    System.out.println("Menu de cuentas");
                    accountMenu();
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }
    }


    public void personMenu(){
        while(true){
            int option = FormRuleValidator.validateInt("""
                    1. crear Persona.
                    2. Buscar persona por Id.
                    3. Listas todas las personas.
                    """);

            switch (option){
                case 1:
                    System.out.println("Crear persona");
                    personView.createPerson();
                    break;
                case 2:
                    System.out.println("Buscar persona por Id");
                    personView.showPersonById();
                    break;
                case 3:
                    System.out.println("Listar todas las personas");
                    personView.showPersons();
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }
    }

    public void accountMenu(){

        while(true){

            int option = FormRuleValidator.validateInt("""
                    1. crear Cuenta.
                    2. Buscar cuenta por Id.
                    3. Listas todas las cuentas.
                    """);

            switch (option){
                case 1:
                    System.out.println("Crear cuenta");
                    accountView.createAccount();
                    break;
                case 2:
                    System.out.println("Buscar cuenta por Id");
                    int id = FormRuleValidator.validateInt("Ingrese el id de la cuenta a buscar");
                    accountView.selectAccountById(id);
                    break;
                case 3:
                    System.out.println("Listar todas las cuentas");
                    accountView.selectAllAccounts();
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }
    }
}

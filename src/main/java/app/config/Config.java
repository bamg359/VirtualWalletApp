package app.config;

import app.domain.Person;
import app.persistence.db.DataBaseConnection;
import app.persistence.mapper.PersonMapper;
import app.persistence.mapper.RowMapper;
import app.persistence.repository.AccountRepositoryImpl;
import app.persistence.repository.PersonRepositoryImplBD;
import app.service.AccountServiceImpl;
import app.service.PersonServiceImpl;
import app.service.inputports.AccountUseCase;
import app.service.inputports.PersonUseCase;
import app.service.outputports.AccountRepositoryInterface;
import app.service.outputports.PersonRepositoryInterface;
import app.userinterface.AppUserInterface;
import app.view.AccountView;
import app.view.PersonView;

import java.sql.Connection;

public class Config {

    public static AppUserInterface app(){

        Connection connection = DataBaseConnection.getInstance().getConnection();
        RowMapper<Person> rowMapper = new PersonMapper();
        PersonRepositoryInterface personRepositoryInterface = new PersonRepositoryImplBD(connection,rowMapper);
        PersonUseCase personUseCase = new PersonServiceImpl(personRepositoryInterface);
        PersonView personView = new PersonView(personUseCase);

        AccountRepositoryInterface accountRepositoryInterface = new AccountRepositoryImpl();
        AccountUseCase accountUseCase = new AccountServiceImpl(accountRepositoryInterface, personRepositoryInterface);
        AccountView accountView = new AccountView(accountUseCase);


        return new AppUserInterface(personView ,accountView);
    }





}

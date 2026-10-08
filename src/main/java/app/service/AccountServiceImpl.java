package app.service;

import app.domain.Account;
import app.domain.Person;
import app.service.inputports.AccountUseCase;
import app.service.outputports.AccountRepositoryInterface;
import app.service.outputports.PersonRepositoryInterface;

import java.time.LocalDate;
import java.util.List;

public class AccountServiceImpl implements AccountUseCase {

    private final AccountRepositoryInterface accountRepositoryInterface;
    private final PersonRepositoryInterface personRepositoryInterface;
    public AccountServiceImpl(AccountRepositoryInterface accountRepositoryInterface, PersonRepositoryInterface personRepositoryInterface) {
        this.accountRepositoryInterface = accountRepositoryInterface;
        this.personRepositoryInterface = personRepositoryInterface;
    }


    @Override
    public Account createAccount(Integer accountId, String date, double balance, int personId, String accountState) {
        Person person = personRepositoryInterface.selectPersonById(personId);

        if (person == null) {
            throw new IllegalArgumentException("Person with ID " + personId + " does not exist.");
        }

        Account account = new Account(accountId, date, balance, person, accountState);

        return accountRepositoryInterface.saveAccount(account);
    }

    @Override
    public Account selectAccountById(int id) {
        return null;
    }

    @Override
    public List<Account> selectAllAccounts() {
        return accountRepositoryInterface.selectAllAccounts();
    }

    @Override
    public Account updateAccount(Integer accountId, String date, double balance, int personId, String accountState) {
        return null;
    }

    @Override
    public void deleteAccountById(int id) {

    }
}

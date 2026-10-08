package app.view;

import app.domain.Account;
import app.domain.Person;
import app.service.helpers.SetAccountStateHelper;
import app.service.inputports.AccountUseCase;
import app.utils.FormRuleValidator;

import java.time.LocalDate;
import java.util.List;

public class AccountView {


    private final AccountUseCase accountUseCase;

    public AccountView(AccountUseCase accountUseCase){
        this.accountUseCase = accountUseCase;
    }


    public void createAccount(){

        Integer accountId = FormRuleValidator.validateInt("Ingrese solo el id del cliente");
        String creationDate = FormRuleValidator.validateString("INgrese la fecha dd/MM/yyyy");
        double balance = FormRuleValidator.validateDouble("Ingrese el monto de apertura de la cuenta");
        int personId = FormRuleValidator.validateInt("Ingrese el id del cliente");
        String accountState = SetAccountStateHelper.getAaccountState();

        accountUseCase.createAccount(accountId, creationDate , balance , personId, accountState);
    }

    public void selectAccountById(int id){

    }

    public void selectAllAccounts(){

        List<Account> accounts = accountUseCase.selectAllAccounts();

        for(Account account: accounts){
            System.out.println(account.getAccountId() + " " + account.getDate() + " " + account.getBalance() + " " + account.getPerson()+ " " + account.getAccountState());
        }

    }

    public void updateAccount(){

    }

    public void deleteAccount(int id){

    }





}

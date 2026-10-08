package app.service.outputports;

import app.domain.Account;

import java.util.List;

public interface AccountRepositoryInterface {

    Account saveAccount(Account account);

    Account selectAccountById(int id);

    List<Account> selectAllAccounts();

    Account updateAccount(Account account);

    void deleteAccount(int id);

}

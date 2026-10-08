package app.repository;

import app.domain.Account;
import app.service.outputports.AccountRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryImpl implements AccountRepositoryInterface {


    List<Account> accounts = new ArrayList<>();

    @Override
    public Account saveAccount(Account account) {
        accounts.add(account);
        return account;
    }

    @Override
    public Account selectAccountById(int id) {
        return null;
    }

    @Override
    public List<Account> selectAllAccounts() {
        return accounts;
    }

    @Override
    public Account updateAccount(Account account) {
        return null;
    }

    @Override
    public void deleteAccount(int id) {

    }
}

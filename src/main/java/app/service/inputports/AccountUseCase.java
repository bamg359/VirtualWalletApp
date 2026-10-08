package app.service.inputports;

import app.domain.Account;
import app.domain.Person;
import java.time.LocalDate;
import java.util.List;

public interface AccountUseCase {

    public Account createAccount(Integer accountId, String date, double balance
            , int personId, String accountState);

    public Account selectAccountById(int id);

    public List<Account> selectAllAccounts();

    public Account updateAccount(Integer accountId, String date, double balance
            , int personId, String accountState);

    public void deleteAccountById(int id);

}

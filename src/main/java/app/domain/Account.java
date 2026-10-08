package app.domain;

import java.time.LocalDate;

public class Account {

    private Integer accountId;
    private String date;
    private double balance;
    private Person person;
    private String accountState;


    public Account() {
    }

    public Account(Integer accountId, String date, double balance, Person person, String accountState) {
        this.accountId = accountId;
        this.date = date;
        this.balance = balance;
        this.person = person;
        this.accountState = accountState;
    }


    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getAccountState() {
        return accountState;
    }

    public void setAccountState(String accountState) {
        this.accountState = accountState;
    }
}

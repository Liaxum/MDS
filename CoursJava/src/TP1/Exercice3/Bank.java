package TP1.Exercice3;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private final String name;
    private int nbAccounts;
    private final ArrayList<Account> accounts = new ArrayList<Account>(1000);

    public Bank(String name) {
        this.name = name;
        this.nbAccounts = 0;
    }

    public void addAccount(Account account) {
        if (this.findAccountByName(account.getOwner()) == null) {
            this.nbAccounts++;
            this.accounts.add(account);
            System.out.println("Account " + account.getOwner() + " has been added to the bank");
        } else {
            System.out.println("Account already exists in the bank");
        }

    }
    public void removeAccount(Account account) {
        if (account != null) {
            this.nbAccounts--;
            this.accounts.remove(account);
            System.out.println("Account " + account.getOwner() + " has been removed from the bank");
        } else {
            System.out.println("Account does not exist in the bank");
        }

    }

    public Account findAccountByName(String name) {
        Account findAccount = null;
        int i = 0;
        while (i < this.nbAccounts && findAccount == null) {
            findAccount = Objects.equals(this.accounts.get(i).getOwner(), name) ? this.accounts.get(i) : null;
            i++;
        }
        return findAccount;
    }
}

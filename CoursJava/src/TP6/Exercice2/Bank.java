package TP6.Exercice2;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Client> clients = new ArrayList<Client>();
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public void add(Account account)throws Exception {
        if (this.accounts.contains(account)) throw new Exception("Account already exists");
        this.accounts.add(account);
    }

    public void remove(Account account)throws Exception {
        if (!this.accounts.contains(account)) throw new Exception("Account don't exist");
        this.accounts.remove(account);
    }

    public void debit(int noAccount, int amount)throws Exception {
        int i = 0;
        while (i < this.accounts.size() && this.accounts.get(i).getId() != noAccount) {
            i++;
        }

        if (i >= this.accounts.size()) throw new Exception("Account does not exist");
        else if (this.accounts.get(i).getId() != noAccount) {
            this.accounts.get(i).debit(amount);
        }
    }

    public void credit(int noAccount, int amount) throws Exception {
        int i = 0;
        while (i < this.accounts.size() && this.accounts.get(i).getId() != noAccount) {
            i++;
        }

        if (i >= this.accounts.size()) throw new Exception("Account does not exist");
        else if (this.accounts.get(i).getId() != noAccount) {
            this.accounts.get(i).credit(amount);
        }
    }
}

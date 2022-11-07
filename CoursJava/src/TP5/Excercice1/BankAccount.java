package TP5.Excercice1;

public class BankAccount {
    private int id;
    private double amount;

    public BankAccount(int id) {
        this.id = id;
        this.amount = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            this.amount += amount;
            Logging.getInstance("information").addLog("Deposit of " + amount + "€ on the bank account number: " + this.id);
        } else Logging.getInstance("error").addLog("/!\\ Negative deposit impossible (" + this.id + ")");
    }

    public void credit(double amount) {
        if (amount > 0.0) {
            if (this.amount > amount) {
                this.amount -= amount;
                Logging.getInstance("information").addLog("Credit of " + amount + "€ on the bank account number: " + this.id);
            } else Logging.getInstance("error").addLog("/!\\ The bank does'nt allow uncovered transactions (" + this.id + ")");
        } else Logging.getInstance("error").addLog("/!\\ Negative credit impossible (" + this.id + ")");
    }
}

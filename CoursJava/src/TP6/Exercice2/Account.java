package TP6.Exercice2;

public class Account {
    private int id;
    private double amount;


    public Account(int id) {
        this.id = id;
        this.amount = 0;
    }

    public int getId() {
        return this.id;
    }

    public void debit(int amount) throws Exception {
        if (this.amount <= 0) throw new Exception("You don't money'");
        else if (this.amount < amount) throw new Exception("Not enough money");
        this.amount -= amount;
    }

    public void credit(int amount) throws Exception {
        if (amount < 0) throw new Exception("No  negative amount");
        this.amount += amount;
    }
}

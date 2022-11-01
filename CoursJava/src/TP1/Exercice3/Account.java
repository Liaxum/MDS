package TP1.Exercice3;

public class Account {
    // Attributes
    private String owner;
    private int balance;

    // Constructors
    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public Account(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    // Getters
    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    // Setters
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void debit(int amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
        } else {
            System.out.println("The balance cannot be negative.");
        }
    }
    public void payment(Account giver, int amount) {
        if (this.balance > 0 && this.balance <= amount) {
            giver.debit(amount);
            this.credit(amount);
        } else {
            System.out.println("Not enough funds");
        }
    }
    public void credit(int amount) { this.balance += amount; }

    @Override
    public String toString() {
        return "The account owner is " + this.owner + " and his balance is " + this.balance + "€";
    }
}

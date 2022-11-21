package TP6.Exercice2;

public class Client {
    private int id;
    private String name, nickname;
    private Bank bank;

    public Client(int id, String name, String nickname, Bank bank) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.bank = bank;
    }

    public int getId() {
        return this.id;
    }

    public void credit(int amount) throws Exception {
        this.bank.credit(this.id, amount);
    }

    public void debit(int amount) throws Exception {
        this.bank.debit(this.id, amount);
    }
}

package TP6.Exercice2;

public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client = new Client(1, "Romain", "Texier", bank);
        Account account = new Account(client.getId());


        try {
            bank.add(account);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

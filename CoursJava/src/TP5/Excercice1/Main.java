package TP5.Excercice1;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(1);
        bankAccount1.deposit(100);
        bankAccount1.credit(80);

        BankAccount bankAccount2 = new BankAccount(2);
        bankAccount2.credit(10);

        System.out.println("Information: ");
        Logging.getInstance("information").displayLog();

        System.out.println("Error: ");
        Logging.getInstance("error").displayLog();

    }
}

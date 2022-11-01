package Example1;

public class Test {
    public static void main(String[] args) {
        // First test
        Rectangle rect1 = new Rectangle(1, 1, 100, 100);
        System.out.println("Rectangle 1: x:" + rect1.getX() + " y:" + rect1.getY());
        rect1.translate(1);
        System.out.println("Translate by 1: x:" + rect1.getX() + " y:" + rect1.getY());
        rect1.translate(1, 2);
        System.out.println("Translate by a=1 b=2 : x:" + rect1.getX() + " y:" + rect1.getY() + "\n");

        // Second Test
        Rectangle rect2 = new Rectangle(100, 100);
        System.out.println("Rectangle 2: x:" + rect2.getX() + " y:" + rect2.getY());
        rect2.translate(1);
        System.out.println("Translate by 1: x:" + rect2.getX() + " y:" + rect2.getY());
        rect2.translate(1, 2);
        System.out.println("Translate by a=1 b=2 : x:" + rect2.getX() + " y:" + rect2.getY() + "\n");

        // BankAccount Test
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount(1200);

        System.out.println("BankAccount 1: " + ba1.getBalance());
        System.out.println("BankAccount 2: " + ba2.getBalance());
        ba1.deposit(10);
        ba2.deposit(10);
        System.out.println("Deposit 10 on BankAccount 1: " + ba1.getBalance());
        System.out.println("Deposit 10 on BankAccount 2: " + ba2.getBalance());
        ba1.withdraw(200);
        ba2.withdraw(200);
        System.out.println("Withdaw 200 on BankAccount 1" + ba1.getBalance());
        System.out.println("Withdaw 200 on BankAccount 2" + ba1.getBalance());

    }
}
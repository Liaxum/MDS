package TP1.Exercice3;

public class AccountTest {
    public static void main(String[] args) {
        Account poor = new Account("Michael");
        Account giver = new Account("Giver", 1200);
        System.out.println(poor);
        System.out.println(giver);
        System.out.println("Giver sent 200 to Michael");
        poor.payment(giver, 200);
        System.out.println(poor);
        System.out.println(giver);
    }
}

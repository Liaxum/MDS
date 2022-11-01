package TP1.Exercice3;

import java.util.Scanner;

public class BankTest {
    private static Bank bank = new Bank("Crédit Blésois");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            System.out.println("What do you want to do ? \n" +
                    "\t1 -> Add a new account. \n" +
                    "\t2 -> Check your account.\n" +
                    "\t3 -> Remove an account. \n" +
                    "\t0 -> Quit");
            int userResponse = scanner.nextInt();
            // Empty bad characters
            scanner.nextLine();
            switch (userResponse) {
                case 1 -> newAccount();
                case 2 -> checkAcount();
                case 3 -> removeAccount();
                case 0 -> quit = true;

            }
        }
    }

    public static void newAccount() {
        System.out.println("What is the name of the new account? ");
        String accountName = scanner.nextLine();
        bank.addAccount(new Account(accountName));
    }

    public static void removeAccount() {
        Account account = findAccount();
        bank.removeAccount(account);
    }

    public static void checkAcount() {
        Account userAccount = findAccount();
        if (userAccount != null) {
            boolean quit = false;
            while (!quit) {
                System.out.println(userAccount);
                System.out.println("What do you want to do with this account?\n" +
                        "\t1 -> Credit \n" +
                        "\t2 -> Debit \n" +
                        "\t3 -> Payment \n" +
                        "\t0 -> Nothing");
                int userResponse = scanner.nextInt();
                // Empty bad characters
                scanner.nextLine();

                switch (userResponse) {
                    case 1 -> credit(userAccount);
                    case 2 -> debit(userAccount);
                    case 3 -> payment(userAccount);
                    case 0 -> quit = true;
                }
            }

        } else {
            System.out.println("Account not found");
        }
    }

    public static void credit(Account account) {
        System.out.println("Amount to deposit: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        account.credit(amount);
    }

    public static void debit(Account account) {
        System.out.println("Amount to credit: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        account.debit(amount);
    }

    public static void payment(Account account) {
        Account accountToPay = findAccount();
        if (accountToPay != null) {
            System.out.println("Amount to send to " + accountToPay.getOwner() + ":");
            int amount = scanner.nextInt();
            // Empty bad characters
            scanner.nextLine();
            accountToPay.payment(account, amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public static Account findAccount() {
        System.out.println("What is the name of the account? ");
        String accountName = scanner.nextLine();
        return bank.findAccountByName(accountName.trim());
    }
}

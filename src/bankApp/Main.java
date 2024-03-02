package bankApp;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();

    }

    private static void mainMenu() {
        print("WELCOME TO MAVERICKS BANK");
        print("1. Register an account");
        print("2. Deposit");
        print("3. Withdraw");
        print("4. Transfer");
        print("5. Check Balance");
        print("6. Close account");
        print("7. Exit");
        String response = input("What would you like to do: ");
        switch (response){
            case "1" -> register();
            case "2" -> deposit();/*
            case "3" -> withdraw();
            case "4" -> transfer();
            case "5" -> checkBalance();
            case "6" -> closeAccount();
            */case "7" -> exit();
        }
    }

    private static void deposit() {
        String number = input("Enter accountNumber");
        String amount = input("Enter amount");
        Bank bank = new Bank("Mavericks");
        //print(bank.findAcccount());
    }

    private static void register() {
        try {
            String firstName = input("Enter your firstName");
            String lastName = input("Enter your lastName");
            String pin = input("Enter pin");
            Bank bank = new Bank("Mavericks");
            Account newAccount = bank.registerCustomer(firstName, lastName, pin);
            print("Account creation successful");
            print("You account number is " + newAccount.getAccountNumber());
        } catch (Exception e) {
            print(e.getMessage());
        }
        finally {
            mainMenu();
        }

    }

    private static void exit() {
        System.exit(-1);
    }

    public static String input(String prompt){
        print(prompt);
        return scanner.nextLine();
    }
        public static void print(String value){
        System.out.println(value);
    }
}

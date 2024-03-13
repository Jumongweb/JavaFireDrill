package bankApp;

import myDiary.exceptions.InvalidPasswordException;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Bank bank = new Bank("Mavericks");
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
            case "2" -> deposit();
            case "3" -> withdraw();
            case "4" -> transfer();
            case "5" -> checkBalance();
            case "6" -> closeAccount();
            case "7" -> exit();
            default -> defaultCase();
        }
    }

    private static void closeAccount() {
        System.out.println("Enter account number to remove: ");
        String number = scanner.nextLine();
        try{
            if (bank.findAcccount(Integer.parseInt(number)) == null) print("Account not found");
            else bank.remove(Integer.parseInt(number));
        } catch (Exception e) {
            print(e.getMessage());
        }
        finally {
            mainMenu();
        }
    }

    private static void transfer() {
        try{
            System.out.println("Enter sender account number: ");
            String sender = scanner.nextLine();
            System.out.println("Enter receiver account number: ");
            String receiver = scanner.nextLine();
            System.out.println("Enter amount you want to transfer: ");
            String amount = scanner.nextLine();
            String pin = input("Enter your pin");
            bank.transfer(Integer.parseInt(sender), Integer.parseInt(receiver), Integer.parseInt(amount), pin);
        }
        catch (Exception e){
            print(e.getMessage());
        }
        finally {
            mainMenu();
        }
    }

    private static void defaultCase(){
        print("Select from 1 - 7 only");
        mainMenu();
    }

    private static void withdraw() {
        try {
            System.out.println("Enter account number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter amount to withdraw: ");
            int amount = scanner.nextInt();
            scanner.nextLine();
            String pin = input("Enter pin: ");
            if (bank.findAcccount(number) == null) print("Account not found");
            else {
                bank.withdraw(number, amount, pin);
                System.out.printf("%d withdrawn from %d%n", amount, number);
            }
        } catch (Exception e){
            print(e.getMessage());
        }
        finally {
            mainMenu();
        }
    }

    private static void checkBalance() {
        try{
            System.out.print("Enter account number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            String pin = input("Enter your pin: ");
            if (bank.findAcccount(number) == null){
                print("Account not found");
            }
            else {
                System.out.printf("Your account balance is: %d", bank.checkBalance(number, pin));
            }
        } catch (Exception e){
            print(e.getMessage());
        }
        finally {
            mainMenu();
        }

    }

    private static void deposit() {
        try{
            //String number = input("Enter accountNumber");
            System.out.print("Enter accountNumber: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            //String amount = input("Enter amount: ");
            System.out.print("Enter amount: ");
            int amount = scanner.nextInt();
            scanner.nextLine();
            if (bank.findAcccount(number) == null){
                print("Account not found");
            }
            else {
                bank.deposit(number, amount);
                System.out.printf("%d deposited to account number: %d%n", amount, number);
            }
        } catch (Exception e){
            print(e.getMessage());
        }
        finally {
            mainMenu();
        }

    }

    private static void register() {
        try {
            String firstName = input("Enter your firstName");
            String lastName = input("Enter your lastName");
            String pin = input("Enter pin");
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
        print("Goodbye");
        print("Hope to see you again soon");
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

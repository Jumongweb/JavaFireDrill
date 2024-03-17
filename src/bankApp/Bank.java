package bankApp;

import java.util.ArrayList;
import java.util.List;
import bankApp.exceptions.InvalidAccountException;

public class Bank {
    private String name;
    private int noOfAcounts;
    private final List<Account> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public int generateAccountNumber(){
        return 1000 + noOfAcounts;
    }

    public Account registerCustomer(String firstName, String lastName, String pin){
        Account account = new Account(firstName + " " + lastName, + 0, pin, 10001 + getNumberOfAccounts());
        accounts.add(account);
        noOfAcounts++;
        return account;
    }

    public int getNumberOfAccounts(){
        return noOfAcounts;
    }

    public Account findAcccount(int number){
        for (Account account : accounts){
            if (account.getAccountNumber() == number){
                return account;
            }
        }
        for (Account account : accounts){
            if (!(account.getAccountNumber() == number)){
                throw new InvalidAccountException("Invalid account");
            }
        }
        return null;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void deposit(int number, int amount) {
        for (Account account : accounts){
            if (account.getAccountNumber() == number){
                account.deposit(amount);
            }
        }
    }

    public void multipleTransfer(int amount, Account... accountsToCredit){
        int count = 0;
        for (int i = 0; i < accounts.size(); i++){
            if (count == accountsToCredit.length){
                break;
            }
            if (accounts.contains(accountsToCredit[i])) {
                accountsToCredit[i].deposit(amount);
            }
            count++;
        }
    }
    public int checkBalance(int number, String pin) {
        Account account = findAcccount(number);
        return account.checkBalance(pin);
    }

    public void transfer(int senderAccountNumber, int receiverAccountNumber, int amount, String pin) {
        Account from = findAcccount(senderAccountNumber);
        Account to = findAcccount(receiverAccountNumber);
        from.withdraw(amount, pin);
        to.deposit(amount);
    }

    public void validate(int accountNumber){

    }

    public void withdraw(int accountNumber, int amount, String pin) {
        Account receiver = findAcccount(accountNumber);
        receiver.withdraw(amount, pin);
    }

    public void remove(int number) {
        Account account = findAcccount(number);
        accounts.remove(account);
        noOfAcounts--;
    }
}

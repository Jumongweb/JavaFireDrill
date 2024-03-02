package bankApp;

import bankApp.exceptions.InsufficientFundsException;
import bankApp.exceptions.InvalidAmountException;
import bankApp.exceptions.InvalidPinException;

public class Account {

    private String name;
    private int number;
    private final String pin;
    private int balance;

    public Account(String name, int balance, String correctPin, int accountNumber) {
        this.name = name;
        this.balance = balance;
        this.pin = correctPin;
        this.number = accountNumber;
    }
    public void deposit(int amount) throws InvalidAmountException {
        if (amount > 0){ balance += amount; }
        else {
            throw new InvalidAmountException("Invalid amount");
        }
    }

    public void withdraw(int amount, String pin) throws InsufficientFundsException, InvalidAmountException {
        validate(pin);
        if (amount <= 0){ throw new InvalidAmountException("Invalid amount"); }
        if (amount > balance) throw new InsufficientFundsException("Insufficient fund");
        balance -= amount;
    }



    public int checkBalance(String pin) throws InvalidPinException {
        validate(pin);
        return balance;
    }

    public String getName(){
        return name;
    }


    @Override
    public String toString(){
        return String.format("%s%n%s%n%s%n", getName(), getAccountNumber(), checkBalance("1234"));
    }

    public void validate(String pin){
        if (!(this.pin.equals(pin))) throw new InvalidPinException("Incorrect pin");
    }

    public int getAccountNumber() {
        return number;
    }
}

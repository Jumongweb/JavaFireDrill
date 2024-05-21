package dietel_c16;

public class Transaction  /*implements Comparable<Transaction> */{
    private String amount;
    private String accountNumber;

    public Transaction(String amount, String accountNumber) {
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    public String getAmount() {
        return amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount='" + amount + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}

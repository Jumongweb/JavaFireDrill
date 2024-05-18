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

//    @Override
//    public int compareTo(Transaction o) {
//        return 0;
//    }
}

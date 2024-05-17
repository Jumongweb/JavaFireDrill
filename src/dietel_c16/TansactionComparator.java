package dietel_c16;

import java.util.Comparator;

public class TansactionComparator implements Comparator<Transaction> {
    @Override
    public int compare(Transaction previousTransaction, Transaction nextTransaction) {
        return nextTransaction.getAmount().compareTo(previousTransaction.getAmount());
    }
}

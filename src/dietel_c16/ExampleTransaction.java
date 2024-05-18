package dietel_c16;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTransaction {
    public static void main(String[] args) {
        Comparator<Transaction> comparator = (previousTransaction, nextTransaction )->{
            return nextTransaction.getAmount().compareTo(previousTransaction.getAmount());
        };
        Set<Transaction> transactions = new TreeSet<>(comparator);
//        transactions.add(new Transaction());
//        transactions.add(new Transaction());
//        transactions.add(new Transaction());

    }
}

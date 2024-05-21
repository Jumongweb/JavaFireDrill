package dietel_c17.c19.streams;

import dietel_c16.Transaction;

import java.math.BigDecimal;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Transaction> numbers = List.of(new Transaction("$3000", "12345"),
                                            new Transaction("$1000", "98765"),
                                            new Transaction("$100", "24689"));

        numbers.stream()  // {{"$2000", "12345"}, {"$1000", "98765"}, {"$100", "24689"}}
                .filter((transaction) -> new BigDecimal(transaction.getAmount()
                        .substring(1))
                        .compareTo(new BigDecimal(100))> 0)
                .forEach(System.out::println);

    }
}

package dietel_c17.c19.streams;

import dietel_c16.Transaction;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(20, 30, 40, 50);
        Stream<Integer> stream = numbers.stream();
//        stream.forEach(System.out::println);
        stream.forEach(number-> System.out.println(number));

        Stream<String> emptyStream = Stream.empty();

        Stream<Transaction> transactionStream =
                Stream.of(new Transaction("$100", "12345"),
                        new Transaction("$1000", "23456"));

        transactionStream.forEach(transaction ->
                        System.out.printf("account with id %s has %s in it\n", transaction.getAccountNumber(), transaction.getAmount())
                );

        Stream<Integer> integerStream = Stream.generate(()-> new SecureRandom().nextInt()).limit(4);
        integerStream.forEach(System.out::println);

        /*
        List<String> names = new ArrayList<>();
        names.add("Lawal");
        names.add("Toheeb");
        names.add("Jumong");
        names.forEach(System.out::println);
        names.stream().forEach(System.out::println);  */
    }
}

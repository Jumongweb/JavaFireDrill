package dietel_c17.c19.interfaces;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierSample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()->new Random().nextInt(1,20);
        Supplier<Integer> supplier2 = ()-> 5;
        Supplier<String> supplier3 = ()-> "Prince of persia";
        System.out.println(supplier.get());
        System.out.println(supplier2.get());
        System.out.println(supplier3.get());

        Supplier<Boolean> result = ()-> true;
        System.out.println(result.get());

        Stream.generate(supplier)
//                .forEach(x-> System.out.println(x));
                .forEach(System.out::println);
    }
}

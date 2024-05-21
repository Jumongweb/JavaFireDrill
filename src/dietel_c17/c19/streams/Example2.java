package dietel_c17.c19.streams;

import java.util.stream.IntStream;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 10)
                .filter((number) -> number % 2 == 0).sum());
        System.out.println("=====");
        IntStream.rangeClosed(1,10)
                .filter((num)-> num % 3 == 0)
                .forEach(System.out::println);
//        .forEach(System.out::println);


    }
}

package dietel_c17.c19_class.streams;

import java.util.stream.IntStream;

public class Example6 {
    public static void main(String[] args) {
        String word = "Hello";
        String word2 = "World";
        String word3 = "filter";
        String word4 = "reduce";

        IntStream intStream = word.chars();
        intStream.forEach(System.out::println);

        // shorter way
//        word.chars().forEach(System.out::println);

        System.out.println("============");
        word2.chars().forEach(System.out::println);

        System.out.println("============");
        word3.chars()
                .filter((number)-> number > 100)
                .map((number) -> number * number)
                .forEach(System.out::println);

        System.out.println("=".repeat(10));

        Boolean result =  word4.chars() // [72, 101, 108, 108, 111]
                .filter((number)-> number > 100) // [101, 108, 108, 111]
                .mapToObj((number)-> Boolean.TRUE) // [true, true, true, true ]
                .reduce(false, (a, b)-> a != b);

        System.out.println(result);

    }
}

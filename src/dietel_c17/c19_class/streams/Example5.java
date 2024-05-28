package dietel_c17.c19_class.streams;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> numbers = List.of("QWERTY", "ASDFG", "ABCDEFFF", "ABC");

        numbers.stream()
                .map((word)-> word.length())
                .forEach(System.out::println);


    }


}

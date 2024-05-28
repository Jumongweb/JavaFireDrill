package dietel_c17.c19_class.streams;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 25, 30, 40, 50);
        numbers.stream()
                .filter((number)-> number % 2 == 0)
                        .forEach(System.out::println);

    }
}

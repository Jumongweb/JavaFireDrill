package dietel_c17.c19.streams;

import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(31,2,13,4,1, 4,15,3,19,1);

        List<Integer> result = numbers.stream()
                                .distinct()
                                .sorted()
                                .toList();

        System.out.println(result);
    }
}

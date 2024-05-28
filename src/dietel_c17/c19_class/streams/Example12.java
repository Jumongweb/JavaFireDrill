package dietel_c17.c19_class.streams;

import java.util.List;
import java.util.stream.IntStream;

public class Example12 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        var stats = numbers.stream().flatMapToInt((num) -> IntStream.of(num * 2))
                //                .forEach(System.out::println);
                //                .average().orElseThrow(()-> new RuntimeException("Number not present"));
                .summaryStatistics();
        System.out.println(stats);
        stats.accept(10);
        System.out.println(stats);

    }
}

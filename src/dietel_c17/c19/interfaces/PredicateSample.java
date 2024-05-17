package dietel_c17.c19.interfaces;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (i)-> (i > 18);

        System.out.println(predicate.test(10));
        System.out.println(predicate.test(20));

    }
}

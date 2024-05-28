package dietel_c17.c19_class.functional_interfaces;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer>  biPredicate = (num1, num2) -> num1 > num2;

        System.out.println(biPredicate.test(19, 4));
        System.out.println(biPredicate.test(19, 34));

    }
}

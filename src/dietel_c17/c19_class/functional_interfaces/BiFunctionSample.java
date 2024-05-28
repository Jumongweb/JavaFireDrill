package dietel_c17.c19_class.functional_interfaces;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction =
                (word, number)-> word.length()== number;

        Boolean result = biFunction.apply("Jagaban", 17);
        System.out.println(result);
    }
}

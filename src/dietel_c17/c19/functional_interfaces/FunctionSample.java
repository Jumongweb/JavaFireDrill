package dietel_c17.c19.functional_interfaces;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
//        Function<String, Integer> function = (word)-> word.length();
        Function<String, Integer> function = word-> word.length();
//        Function<String, Integer> function = String::length;

    System.out.println(function.apply("Hello"));
    }
}

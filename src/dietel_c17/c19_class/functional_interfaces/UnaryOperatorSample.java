package dietel_c17.c19_class.functional_interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (num)-> num;
        UnaryOperator<String> unaryOperator2 = (Jane)-> Jane + " Doe";

        System.out.println(unaryOperator.apply(4));
        System.out.println(unaryOperator.apply(2));
        System.out.println(unaryOperator2.apply("Jane"));
    }
}

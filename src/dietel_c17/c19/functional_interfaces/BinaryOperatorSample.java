package dietel_c17.c19.functional_interfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (number, num) -> number / num;

        System.out.println(binaryOperator.apply(20,5));
    }
}

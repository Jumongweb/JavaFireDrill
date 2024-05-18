package dietel_c17.c19.functional_interfaces;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorSample {
    public static void main(String[] args) {
        LongUnaryOperator unaryOperator = (num)-> 2 * num;

        System.out.println(unaryOperator.applyAsLong(43L));
    }
}

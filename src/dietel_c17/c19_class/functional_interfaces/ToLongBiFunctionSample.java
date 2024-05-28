package dietel_c17.c19_class.functional_interfaces;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionSample {
    public static void main(String[] args) {
//        ToLongBiFunction<Integer, Integer> toLongBiFunction = (num1, num2) -> num1 + num2;
        ToLongBiFunction<Integer, Integer> toLongBiFunction = Integer::sum;

        long result = toLongBiFunction.applyAsLong(10, 20);

        System.out.println(result);
    }
}

package dietel_c17.c19.functional_interfaces;

import java.util.function.ToIntFunction;

public class ToIntFunctionSample {
    public static void main(String[] args) {
        ToIntFunction<String> toIntFunction1 = (word)-> word.length();
        int result1 = toIntFunction1.applyAsInt("firstWord");
        System.out.println(result1);

        ToIntFunction<Integer> toIntFunction2 = (value) -> value * 2;
        int result2 = toIntFunction2.applyAsInt(10);
        System.out.println(result2);

        ToIntFunction<Double> toIntFunction3 = (decimal) -> decimal.intValue();
        int result3 = toIntFunction3.applyAsInt(5.5);
        System.out.println(result3);

    }
}

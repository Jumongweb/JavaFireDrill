package dietel_c17.c19.functional_interfaces;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionSample {
    public static void main(String[] args) {
        ToIntBiFunction<Integer, Integer> toIntBiFunction1 = (a, b) -> a * b;
        int result1 = toIntBiFunction1.applyAsInt(5, 3);
        System.out.println(result1);

        ToIntBiFunction<String, String> toStringBiFunction2 = (a, b) -> a.length() + b.length();
        int result2 = toStringBiFunction2.applyAsInt("Hello", "World");
        System.out.println(result2);

        ToIntBiFunction<Long, Long> toLongBiFunction3 = (a, b) -> a.intValue() / b.intValue();
        int result3 = toLongBiFunction3.applyAsInt(10L, 2L);
        System.out.println(result3);
    }
}

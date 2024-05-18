package dietel_c17.c19.functional_interfaces;

import java.util.function.ToLongFunction;

public class ToLongFunctionSample {
    public static void main(String[] args) {
        ToLongFunction<String> toLongFunction = (name)-> name.length();

        long length = toLongFunction.applyAsLong("James");
        System.out.println(length);
    }
}

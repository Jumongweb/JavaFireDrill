package dietel_c17.c19_class.functional_interfaces;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionSample {
    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = (decimalNumber)-> Double.valueOf(decimalNumber).intValue();

        int number = doubleToIntFunction.applyAsInt(24.5);
        System.out.println(number);


    }
}
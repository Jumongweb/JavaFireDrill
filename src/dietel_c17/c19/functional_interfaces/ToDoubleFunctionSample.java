package dietel_c17.c19.functional_interfaces;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionSample {
    public static void main(String[] args) {
        ToDoubleFunction<Integer> toDoubleFunction = (value)-> value;
        double value = toDoubleFunction.applyAsDouble(2);
        System.out.println(value);

        ToDoubleFunction<String> toDoubleFunction1 = (value2)-> Double.parseDouble(value2);
        double value2 = toDoubleFunction1.applyAsDouble("2.5");
        System.out.println(value2);


    }
}

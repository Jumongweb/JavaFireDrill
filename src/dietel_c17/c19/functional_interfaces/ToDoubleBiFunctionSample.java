package dietel_c17.c19.functional_interfaces;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionSample {
    public static void main(String[] args) {
        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (num1, num2)-> num1 * num2;
        double result = toDoubleBiFunction.applyAsDouble(10, 20);
        System.out.println(result);

        ToDoubleBiFunction<String, String> toDoubleBiFunction2 = (word1, word2)-> word1.length() + word2.length();
        double result2 = toDoubleBiFunction2.applyAsDouble("Hello", "World");
        System.out.println(result2);

    }
}

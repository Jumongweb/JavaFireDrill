package dietel_c17.c19.interfaces;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
//        BiConsumer<String, String> biConsumer = (s1, s2) -> printFullName(s1, s2);
        BiConsumer<String, String> biConsumer = BiConsumerSample::printFullName;
        biConsumer.accept("Hello", "World");

        BiConsumer biConsumer1 = (b1, b2) -> System.out.println(b1 + " " + b2);
        biConsumer1.accept("Try", "Catch");

        Map<String, Integer> map =  Map.of(
                "John", 10,
                "Jane", 15,
                "Jack", 20
        );
        map.forEach(biConsumer1);
    }

    public static void printFullName(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }
}

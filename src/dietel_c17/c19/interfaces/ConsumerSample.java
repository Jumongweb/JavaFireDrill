package dietel_c17.c19.interfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = (word) ->{
            System.out.println("You have entered " + word);
            System.out.println("I am printing " + word);
        };
        consumer.accept("Hello");

        List<String> names = List.of("John", "Joe", "Johnny");

        names.forEach(consumer);

        var c = consumer.andThen((a)-> System.out.println("running and then for " + a));
        c.accept("Jane");

        Consumer<String> one = (first)-> System.out.println("something " + first);
        one.accept("Jane");

    }
}

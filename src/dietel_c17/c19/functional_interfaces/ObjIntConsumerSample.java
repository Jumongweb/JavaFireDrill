package dietel_c17.c19.functional_interfaces;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerSample {
    public static void main(String[] args) {
        ObjIntConsumer<Person> objIntConsumer = (name, number)->{
            System.out.println(name + "--> " + number);
        };

        objIntConsumer.accept(new Person("NoOne", 20, "Shim"), 304);
    }
}

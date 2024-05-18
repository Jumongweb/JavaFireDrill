package dietel_c17.c19.functional_interfaces;

import java.util.function.ObjLongConsumer;

public class ObjLongConsumerSample {
    public static void main(String[] args) {
        ObjLongConsumer<Person> person = (person1, id)->{
            System.out.println(person1 + " -------> " + id);
        };

        person.accept(new Person("Solomon", 20, "Male"), 10001L);
    }
}

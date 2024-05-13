package dietel_c16.Generic;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        /**
         * Boolean ---> boolean
         * Byte ---> byte
         * Short ---> short
         * Character ---> char
         * Integer ---> int
         * Long ---> long
         * Float ---> float
         * Double ---> double
         */

        boolean b = true;
        Collection<String> words = new TreeSet<>();
        words.add("Happy");
        words.add("Happy");
        words.add("Happy");
        words.add("Happy");

        System.out.println(words);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(4);

        List<Integer> number2 = new ArrayList<>();
        number2.add(4);
        number2.add(5);
        number2.add(8);
        number2.add(4);

        Set<List<Integer>> set = new HashSet<>();
        set.add(numbers);
        set.add(number2);

        // only only list is printed because they have same values in the same order
        System.out.println(set);

    }
}

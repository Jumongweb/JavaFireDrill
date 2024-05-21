package dietel_c17;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,10).average());

        // print elements in a closed range including the first and second arguments
        System.out.println("Sum of 1 through 10 is: " +
                IntStream.rangeClosed(1,10).sum());

        // print elements in the range starting from the first argument excluding the second argument
        System.out.println("Sum of 1 through 9 is: " + IntStream.range(1,10).sum());

    }

}

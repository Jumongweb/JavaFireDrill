package dietel_c17;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,10));

        System.out.printf("The sum of 1 through 10 is: %d",
            IntStream.rangeClosed(1,10).sum());
    }

}

package dietel_c17.c19;

import java.util.stream.IntStream;

public class StreamMapReduce {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 10).map((int num) -> num * 2).sum());
//        System.out.println(IntStream.rangeClosed(1,20).map((int num)-> num).filter();


    }
}

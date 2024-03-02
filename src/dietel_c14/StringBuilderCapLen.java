package dietel_c14;

import java.util.Queue;

public class StringBuilderCapLen {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello, how are you?");
        System.out.printf("buffer = %s%nLength = %s%nCapacity = %s%n", buffer.toString(), buffer.length(), buffer.capacity());
        buffer.ensureCapacity(75);
        System.out.printf("New capacity = %s%n", buffer.capacity());
        buffer.setLength(10);
        System.out.printf("New length = %d%nBuffer = %s%n", buffer.length(), buffer.toString());
        //Queue
    }
}

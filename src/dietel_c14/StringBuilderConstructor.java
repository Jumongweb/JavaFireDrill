package dietel_c14;

public class StringBuilderConstructor {
    public static void main(String[] args) {
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder(10);
        StringBuilder buffer3 = new StringBuilder("hello");

        System.out.printf("Buffer1 = \"%s\"%n", buffer1);
        System.out.printf("Buffer2 = \"%s\"%n", buffer2);
        System.out.printf("Buffer3 = \"%s\"%n", buffer3);
    }
}

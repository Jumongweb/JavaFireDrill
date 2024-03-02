package dietel_c14;

public class StringConstructor {
    public static void main(String[] args) {
        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("Hello");

        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray, 6, 3);

        System.out.printf("S1 = %s%nS2 = %s%nS3 = %s%nS4 = %s%n", s1, s2, s3, s4);
    }
}

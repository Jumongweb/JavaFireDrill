package dietel_c14;

public class SubString {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";
        System.out.printf("Substring from index 20 to the end is %s%n", letters.substring(20));
        System.out.printf("Substring from index 3 - 6 is %s%n", letters.substring(3, 6));
    }
}

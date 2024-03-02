package dietel_c14;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Happy";
        String s2 = "Birthday";

        System.out.printf("s1 = %s %ns2 = %s%n", s1, s2);
        System.out.printf("Result of s1.concat(s2) = %s%n",s1.concat(s2));
        System.out.printf("S1 after concatenation = %s", s1);
        System.out.println();
    }
}

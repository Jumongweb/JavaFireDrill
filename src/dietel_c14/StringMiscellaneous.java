package dietel_c14;

public class StringMiscellaneous {
    public static void main(String[] args) {
        String s1 = "Hello there";
        char[] charArray = new char[5];
        System.out.printf("S1: %s", s1);

        System.out.printf("%nLength of s1: %d%n", s1.length());
        System.out.print("The string reverse is : ");
        for (int count = s1.length() - 1; count >= 0; count--){
            System.out.printf("%c ", s1.charAt(count));
        }

        s1.getChars(0, 5, charArray, 0);
        System.out.printf("%nThe character array is: ");
        for (char statement : charArray){
            System.out.print(statement);
        }
        System.out.println();
    }
}

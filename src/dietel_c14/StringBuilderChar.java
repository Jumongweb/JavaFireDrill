package dietel_c14;

public class StringBuilderChar {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello there");
        System.out.printf("Character at index zero = %s%nCharacter at index 4 = %s%n", buffer.charAt(0), buffer.charAt(4));
        char[] CharArray = new char[buffer.length()];

        buffer.getChars(0, buffer.length(), CharArray, 0);
        System.out.print("The char arrays are: ");

        for (char statement : CharArray){
            System.out.print(statement);
        }
        System.out.println("Buffer = " + buffer.toString());
        System.out.println("Buffer = " + buffer.reverse());
    }
}

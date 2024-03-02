package dietel_c14;

public class StringMiscelleneous {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = "        space       ";
        System.out.printf("S1 = %s%nS2 = %s%nS3 = %s%n", s1, s2, s3);
        System.out.printf("Replace 'l' with 'L' in S1: %s%n", s1.replace('l', 'L'));
        System.out.println(s3.trim());
        System.out.print("S1 as a character array = ");
        char[] charArray = s1.toCharArray();
        for (char letters : charArray){
            System.out.print(letters);
        }
        System.out.println();
    }
}

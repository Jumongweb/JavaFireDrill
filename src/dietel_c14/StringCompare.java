package dietel_c14;

public class StringCompare {
    public static void main(String[] args) {

        String s1 = new String("hello");
        String s2 = "goodbye";
        String s3 = "Happy BirthDay";
        String s4 = "happy birthday";
        System.out.printf("S1: %s%nS2: %s%nS3: %s%nS4: %s%n", s1, s2, s3, s4);

        if (s1.equals("hello")) {
            System.out.println("S1 equals \"hello\"");
        } else {
            System.out.println("S1 does not equals \"hello\"");
        }
        System.out.println();
        if (s1 == "hello") System.out.println("S1 is the same object as \"hello\"");
        else System.out.println("S1 is not the same object as \"hello\"");

        if (s3.equalsIgnoreCase(s4)) System.out.printf("%s equals %s with case ignored%n", s3, s4);
        System.out.printf("%nS1.comparesTo(s2) is %d", s1.compareTo(s2));
        System.out.printf("%nS2.comparesTo(s1) is %d", s2.compareTo(s1));
        System.out.printf("%nS1.comparesTo(s1) is %d", s1.compareTo(s1));
        System.out.printf("%nS3.comparesTo(s4) is %d", s3.compareTo(s4));
        System.out.printf("%nS4.comparesTo(s3) is %d", s4.compareTo(s3));

        if (s3.regionMatches(0, s4, 0, 5)) {
            System.out.printf("%nFirst 5 character of s3 and s4 match");
        } else {
            System.out.printf("%nFirst 5 character of s3 and s4 does not match");
        }

        if (s3.regionMatches(true, 0, s4, 0, 5)){
            System.out.printf("%nFirst 5 character s3 and s4 matches with ignore case");
        }
        else {
            System.out.printf("%nFirst 5 character do not match");
        }
    }
}
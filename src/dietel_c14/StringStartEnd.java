package dietel_c14;

public class StringStartEnd {
    public static void main(String[] args) {
        String[] strings = {"starting", "started", "ending", "ended"};

        for (String string : strings){
            if (string.startsWith("st")) System.out.printf("\"%s\"start with st%n", string);
        }
        System.out.println();
        for (String string : strings){
            if (string.startsWith("art", 2)) System.out.printf("%s start with \"art\" at index 2%n", string);
        }
        System.out.println();
        for (String string : strings){
            if (string.endsWith("ed")) System.out.printf("%s ends with \"ed\"", string);
        }
    }
}

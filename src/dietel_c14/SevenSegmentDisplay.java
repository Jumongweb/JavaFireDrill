package dietel_c14;

public class SevenSegmentDisplay {
    private static int a = 0;
    private static int b = 0;
    private static int c = 0;
    private static  int d = 0;
    private static int e = 0;
    private static int f = 0;
    private static int g = 0;

    public SevenSegmentDisplay(String value){
        a = Character.getNumericValue(value.charAt(0));
        b = Character.getNumericValue(value.charAt(1));
        c = Character.getNumericValue(value.charAt(2));
        d = Character.getNumericValue(value.charAt(3));
        e = Character.getNumericValue(value.charAt(4));
        f = Character.getNumericValue(value.charAt(5));
        g = Character.getNumericValue(value.charAt(6));
    }

    public static int getA() {
        return a;
    }

    public static void main(String[] args) {
        System.out.println("A is " + getA());
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay("11111111");
        System.out.println("A is " + getA());
        top();
        topSides();
        topSides();
        topSides();
        middle();
        bottomSides();
        bottomSides();
        bottomSides();
        bottom();

        int five = 123456783;
        char[] charArray = new char[8];
        charArray[0] = (char) a;


    }

    private static void top(){
        for (int z = 0; z < 10; z++){
            if (a == 1){
                System.out.print("#");
            }
        }
        System.out.println();
    }
    private static void topSides(){
        for (int x = 0; x < 10; x++){
            if (x == 0 && f == 1 || x == 9 && b == 1){
                System.out.print("#");
            }
            if (x != 8){
                System.out.print(" ");
            }
            if (x == 9){
                System.out.println();
            }
        }
    }

    private static void middle(){
        for (int m = 0; m < 10; m++){
            if (m == 0) System.out.print(" ");
            if ((m != 0 && m != 9) && g == 1){
                System.out.print("#");
            }
        }
        System.out.println();
    }

    private static void bottomSides(){
        for (int x = 0; x < 10; x++){
            if (x == 0 && c == 1 || x == 9 && e == 1){
                System.out.print("#");
            }
            if (x != 8){
                System.out.print(" ");
            }
            if (x == 9){
                System.out.println();
            }
        }
    }

    private static void bottom(){
        for (int a = 0; a < 10; a++){
            if (d == 1){
                System.out.print("#");
            }
        }
        System.out.println();
    }
}

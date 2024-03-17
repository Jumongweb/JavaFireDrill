package dietel_c8.time1;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time1 = new Time1();
        System.out.println("After time object is created");
        System.out.println(time1.toUniversalString());
        System.out.println(time1.toString());

        time1.setTime(13,27,06);
        System.out.println("After calling setTime");
        System.out.println(time1.toUniversalString());
        System.out.println(time1.toString());

        try{
            time1.setTime(9,9,99);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

}

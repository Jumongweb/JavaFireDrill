package fireDrillOne;

public class TaskSix {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++ ){
            if (count % 4 == 0){
                for (int counter = 1; counter <= 5; counter++){
                        System.out.printf("%.0f%n",Math.pow(count, counter));
                }
            }
        }
    }
}

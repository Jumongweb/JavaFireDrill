package fireDrillOne;

public class TaskSeven {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++ ){
            int total = 0;
            if (count % 4 == 0){
                for (int counter = 1; counter <= 5; counter++){
                    total += (int) Math.pow(count, counter);
                }
                System.out.println(total);

            }
        }
    }
}


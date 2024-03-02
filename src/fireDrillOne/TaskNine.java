package fireDrillOne;

public class TaskNine {
    public static void main(String[] args) {
        int total = 0;
        for (int count = 1; count <= 10; count++ ){
            if (count % 4 == 0){
                for (int counter = 1; counter <= 5; counter++){
                    total += (int) Math.pow(count, counter);

                }
            }

        }
        System.out.println(total * total);
    }
}


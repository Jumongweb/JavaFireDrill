package fireDrillTwo;
import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score for 10 student: ");
        int counter = 1;
        int sum = 0;
        while (counter <= 10){
            System.out.printf("Enter score %d: ", counter);
            int score = scanner.nextInt();
            if (score > 0 && score <= 100){
                sum += score;
            }
            counter++;
        }
        System.out.printf("Total of valid score is: %d", sum);
    }
}

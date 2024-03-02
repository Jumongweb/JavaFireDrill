package fireDrillTwo;
import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score for 10 student: ");
        int counter = 1;
        int innerCounter = 0;
        int sum = 0;
        double average = 0;
        while (counter <= 10){
            System.out.printf("Enter score %d: ", counter);
            int score = scanner.nextInt();
            if (score > 0 && score <= 100){
                sum += score;
                innerCounter++;
            }
            counter++;
        }
        average = sum / (double)innerCounter;
        System.out.printf("Average of valid score is: %.1f", average);
    }
}

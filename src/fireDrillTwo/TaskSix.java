package fireDrillTwo;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score for 10 student: ");
        int counter = 1;
        int sum = 0;
        int innerCounter = 0;
        double average = 0;
        while (counter <= 10){
            System.out.printf("Enter score %d: ", counter);
            int score = scanner.nextInt();
            if (score % 2 == 0){
                sum += score;
                innerCounter++;
            }
            counter++;
        }
        average = (double) sum / innerCounter;
        System.out.printf("The average of even numbers in the score is: %.1f", average);
    }
}

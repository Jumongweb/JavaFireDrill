package fireDrillTwo;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score for 10 student: ");
        int counter = 1;
        int sum = 0;
        double average = 0;
        while (counter <= 10){
            System.out.printf("Enter score %d: ", counter);
            int score = scanner.nextInt();
            if (score % 2 == 0){
                sum += score;
            }
            counter++;
        }
        average = (double) sum / counter;
        System.out.printf("The sum of even numbers in the score is: %d", sum);
    }
}

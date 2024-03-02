package fireDrillTwo;
import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score for 10 student: ");
        int counter = 1;
        int sum = 0;
        while (counter <= 10){
            System.out.printf("Enter score %d: ", counter);
            int score = scanner.nextInt();
            while (score < 0 || score > 100){
                System.out.println("Enter a valid score");
                System.out.printf("Enter score %d: ", counter);
                score = scanner.nextInt();
            }
            sum += score;
            counter++;
        }
        System.out.printf("Total score is: %d", sum);
    }
}

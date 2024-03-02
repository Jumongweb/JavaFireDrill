import java.util.ArrayList;
import java.util.Scanner;

public class FirstDrillFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        ArrayList<Integer> numberArray = new ArrayList<>();


        while (number != 22){
                System.out.println("Enter number from 1 - 15: ");
                number = scanner.nextInt();

                if (number >= 1 && number <= 15){
                    numberArray.add(number);
                }
                else {
                    System.out.println("Invalid response");
                }
        }

        System.out.println(numberArray);

        for (int count = 0; count < numberArray.size(); count++){
            for (int counter = 0; counter < numberArray.get(count); counter++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

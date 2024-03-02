package enumPractice;

import java.util.Scanner;

enum Planet { EARTH, JUPITER, MARS, MERCURY, SATURN, NEPTUNE, VENUE, URANUS, PLUTO };
public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Planet myPlanet = Planet.JUPITER;

        System.out.println("Select the planet you want to confirm: ");
        myPlanet = Planet.valueOf(scanner.nextLine().toUpperCase());

        switch (myPlanet){
            case MARS -> System.out.println("Human cannot survive there");
            case EARTH -> System.out.println("Human can survive and live there");
            case PLUTO -> System.out.println("Human cannot live there yet");
            case MERCURY -> System.out.println("Human cannot live there yet");
            case SATURN -> System.out.println("Human cannot live there yet");
            case NEPTUNE -> System.out.println("Human cannot live there yet");
            case VENUE -> System.out.println("Human cannot live there yet");
            case URANUS -> System.out.println("Human cannot live there yet");
            case JUPITER -> System.out.println("Human cannot live there yet");
        }

        System.out.println(myPlanet);

    }
}

package enumPractice;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Planet myPlanet = Planet.JUPITER;

        System.out.println("Select the planet you want to confirm: ");
        myPlanet = Planet.valueOf(scanner.nextLine().toUpperCase());

        switch (myPlanet){
            case MARS -> {
                System.out.println("Human cannot survive there");
                System.out.println("Number # " + myPlanet.getNumber());
            }
            case EARTH -> {
                System.out.println("Human can survive and live there");
                System.out.println("Number # " + myPlanet.getNumber());
            }
            case PLUTO -> {
                System.out.println("Human cannot live there yet");
                System.out.println("Number # " + myPlanet.getNumber());
            }
            case MERCURY -> {
                System.out.println("Human cannot live there yet");
                System.out.println("Number # " + myPlanet.getNumber());
            }
            case SATURN -> {
                System.out.println("Human cannot live there yet");
                System.out.println("Number # " + myPlanet.getNumber());
            }
            case NEPTUNE -> {
                System.out.println("Human cannot live there yet");
                System.out.println("Number # " + myPlanet.getNumber());
            }
            case VENUE -> {
                System.out.println("Human cannot live there yet");
                System.out.println("Number # " + myPlanet.getNumber());
            }
            case URANUS, JUPITER -> {
                System.out.println("Human cannot live there yet");
                System.out.println("Number # " + myPlanet.getNumber());
            }
            default -> System.out.println("Not a valid planet");

        }

        System.out.println(myPlanet);

    }
}

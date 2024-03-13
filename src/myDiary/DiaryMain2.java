package myDiary;

import java.util.Scanner;

import myDiary.exceptions.InvalidEntryException;
import myDiary.exceptions.InvalidPasswordException;
import javax.swing.*;

public class DiaryMain2 {
    private static Diary diary;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createDiary();
        displayMenu();
    }

    private static void displayMenu() {
        print("=".repeat(40));
        print("""
            WELCOME TO HADES DIARY
            What would you like to do
            1. Create entry
            2. Unlock diary
            3. Lock diary
            4. Find entry
            5. Delete entry
            6. Update entry
            7. Exit
                    """);
        print("=".repeat(40));
        String response = scanner.nextLine();
        switch (response) {
            case "1" -> createEntry();
            case "2" -> unlockDiary();
            //case 3 -> lockDiary();
            case "4" -> findEntry();
            case "7" -> System.exit(-500);
            default -> System.out.println("Select from 1-7 only");
        }
    }

    private static void unlockDiary() {
        try {
            print("Enter your password");
            String password = scanner.nextLine();
            diary.unlockDiary(password);
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            displayMenu();
        }
    }

    private static void findEntry() {
        try {
            print("Enter your password: ");
            String password = scanner.nextLine();
            diary.unlockDiary(password);
            System.out.println(diary.isLocked());
            System.out.println("Enter your id ");
            int id = scanner.nextInt();
            if (diary.findEntryBy(id) == null) {
                System.out.println("Entry not found");
            } else {
                System.out.println(diary.findEntryBy(id));
            }
        } catch (Exception e) {
            print(e.getMessage());
        }
        finally {
            displayMenu();
        }
    }

    private static void createDiary() {
        print("To create an account: ");
        print("Choose your username: ");
        String username = scanner.nextLine();
        print("Choose password: ");
        String password = scanner.nextLine();
        diary = new Diary(username, password);

    }

    public static void print(String prompt){
        System.out.println(prompt);
    }
    private static void createEntry() {
        try {
            print("Enter your password: ");
            String password = scanner.nextLine();
            diary.unlockDiary(password);
            print("Your secret is safe with us");
            System.out.println("Enter title: ");
            String title = scanner.nextLine();
            System.out.println("Enter body: ");
            String body = scanner.nextLine();
            diary.createEntry(title, body);
            print("Entry successfully created");
            System.out.printf("Your Id is %s%n", diary.generateId());
        } catch (Exception e) {
            print(e.getMessage());
        }
        finally {
            displayMenu();
        }
    }


}
package myDiary;

import java.util.Scanner;
import myDiary.exceptions.InvalidPasswordException;
import myDiary.exceptions.InvalidEntryException;

public class DiaryMain3 {
    private static Diary diary;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createDiary();
        displayMenu();
    }

    private static void displayMenu() {
        boolean exit = false;
        while (!exit) {
            print("=".repeat(40));
            print("""
                    WELCOME TO HADES DIARY
                    What would you like to do
                    1. Create entry
                    2. Unlock diary
                    3. Find entry
                    4. Lock Diary
                    5. Delete Diary
                    6. Update Diary
                    7. Exit
                    """);
            print("=".repeat(40));
            String response = scanner.nextLine();
            switch (response) {
                case "1" -> createEntry();
                case "2" -> unlockDiary();
                case "3" -> findEntry();
                case "4" -> lockDiary();
                case "5" -> deleteEntry();
                case "6" -> updateEntry();
                case "7" -> exit = true;
                default -> print("Select from 1-4 only");
            }
        }
    }

    private static void updateEntry() {
        print("This feature is being fix, please with us for now");
//        print("Enter you id: ");
//        String id = scanner.nextLine();
//        print("Enter the message you want to add");
//        String body = scanner.nextLine();
//        print("Enter password: ");
//        String password = scanner.nextLine();
//        if (diary.findEntryBy(Integer.parseInt(id)) == null) print("Enter does not exist");
//
//        else diary.update(Integer.parseInt(id), body, password);
    }

    private static void deleteEntry() {
        try {
            print("Enter your id");
            String id = scanner.nextLine();
            if (diary.findEntryBy(Integer.parseInt(id)) == null) print("Entry does not exist");
            diary.delete(Integer.parseInt(id));
        } catch (NumberFormatException e){
            print("Enter number from 1 - 6, only");
        } catch (InvalidPasswordException e){
            print(e.getMessage());
        }

    }

    private static void lockDiary() {
        diary.lock();
        print("Diary is locked");
    }

    private static void unlockDiary() {
        try {
            print("Enter your password:");
            String password = scanner.nextLine();
            diary.unlockDiary(password);
            print("Diary unlocked successfully.");
        } catch (InvalidPasswordException e) {
            print("Invalid password: " + e.getMessage());
        }
    }

    private static void findEntry() {
        try {
            if(diary.isLocked()) print("Diary is locked");
            print("Enter entry ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            Entry entry = diary.findEntryBy(id);
            if (entry != null) {
                print("Entry found:");
                print(entry.toString());
            } else {
                print("Entry not found.");
            }
        } catch (NumberFormatException e) {
            print("Invalid entry ID: ");
        } catch (InvalidPasswordException e) {
            print("Invalid password: ");
        } catch (InvalidEntryException e){
            print("Entry does not exist: ");
        }
    }

    private static void createDiary() {
        print("To create an account:");
        print("Choose your username:");
        String username = scanner.nextLine();
        print("Choose password:");
        String password = scanner.nextLine();
        diary = new Diary(username, password);
        print("Diary created successfully.");
    }

    private static void createEntry() {
        try {
            if(diary.isLocked()) print("Diary is locked");
            print("Enter title:");
            String title = scanner.nextLine();
            print("Enter body:");
            String body = scanner.nextLine();
            diary.createEntry(title, body);
            print("Entry successfully created. ");
            print("Your id is " + diary.generateId());
        } catch (InvalidPasswordException e) {
            print("Invalid password: " + e.getMessage());
        } catch (InvalidEntryException e) {
            print("Invalid entry: " + e.getMessage());
        }
    }

    private static void print(String prompt) {
        System.out.println(prompt);
    }
}

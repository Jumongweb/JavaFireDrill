package myDiary;

import myDiary.exceptions.InvalidPasswordException;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static Diary diary;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createDiary();
        displayMenu();
    }

    private static void createDiary() {
        System.out.println("Welcome To Hades Diary ");
        System.out.println("Your secret is safe with us");
        String username = input("Enter your username: ");
        String password = input("Enter your password: ");
        diary = new Diary(username, password);
        createDiary();
    }

    private static void displayMenu() {
        try {
        print("DIARY");
        print("What would you like to do");
        print("1. Create entry");
        print("2. Unlock diary");
        print("3. lock diary");
        print("4. Find entry");
        print("5. Delete entry");
        print("6. Update entry");
        print("7. Exit");
        int response = Integer.parseInt(input("Enter your response: "));
        switch (response){
            //case 1 -> createEntry();
            //case 2 -> unlockDiary();
            //case 3 -> lockDiary();
            //case 7 -> exit();
            default -> print("Number should be between 1-7");
        }
        } catch (NumberFormatException e){
            print(e.getMessage());
            print("Enter numbers only");
        }
    }

    /*private static void lockDiary() {
        try {
            String passkey = input("Entry password: ");
            diary = new Diary(diary.getUsername(), passkey);
            diary.unlockDiary(passkey);
            if(!(diary.isLocked())) diary.lock();
            print("Locked");
        } catch (InvalidPasswordException e){
            print(e.getMessage());
        }
        finally {
            displayMenu();
        }
    }

    private static void unlockDiary() {
        try {
            String passkey = input("Entry password: ");
            diary = new Diary("username", "passkey");
            diary.unlockDiary(passkey);
            if(diary.isLocked()) diary.unlockDiary(passkey);
            else print("You diary was not never locked");
        } catch (InvalidPasswordException e){
            print(e.getMessage());
        }
        finally {
            displayMenu();
        }

    }

    private static void createEntry() {
        try {
        String username = input("Choose a username: ");
        String password = input("Choose password: ");
        //diary.setPassword(password);
        diary = new Diary(username, password);
        String title = input("Enter title: ");
        String body = input("Write here: ");
        diary.unlockDiary(password);
        diary.createEntry(title, body);
        print("Diary successfully created");
        print("You id is " + diary.generateId());
        //print("Date: " + entry)
        } catch (Exception e){
            print(e.getMessage());
            print("There was an error");
        }
        finally {
            displayMenu();
        }
    }

    private static void exit() {
        print("Goodbye!!!");
        JOptionPane.showInputDialog("Goodbye!!!");
        System.exit(-911);
    }
*/
    public static String input(String input){
        print(input);
        //return scanner.nextLine();
        return JOptionPane.showInputDialog(input);
    }

    public static int input(int input){
        return scanner.nextInt();
    }
    public static void print(String prompt){
        System.out.println(prompt);
    }
    public static void print(int prompt){
        System.out.println(prompt);
    }
}

package myDiary;

import java.util.Scanner;
import myDiary.exceptions.InvalidPasswordException;
import javax.swing.*;

public class DiaryMain {
    private static Diary diary;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createDiary();
        displayMenu();
    }

    private static void displayMenu() {
        try {
            int response = Integer.parseInt(JOptionPane.showInputDialog("""
                    WELCOME TO HADES DIARY
                    What would you like to do
                    1. Create entry
                    2. Unlock diary
                    3. Lock diary
                    4. Find entry
                    5. Delete entry
                    6. Update entry
                    7. Exit
                    """));

            switch (response) {
                case 1 -> createEntry();
                //case 2 -> unlockDiary();
                //case 3 -> lockDiary();
                case 7 -> System.exit(-500);
                default -> JOptionPane.showInputDialog("Number should be between 1-7");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showInputDialog(e.getMessage());
            JOptionPane.showInputDialog("Enter numbers only");
        }
        finally {
            displayMenu();
        }
    }

    private static void createDiary() {
        String username = JOptionPane.showInputDialog("""
                    Welcome To Hades Diary
                    Your secret is safe with us
                    Enter your username:
                """);

        String password = JOptionPane.showInputDialog("Enter your password: ");
        diary = new Diary(username, password);
    }

    private static void createEntry() {
        try {
            String title = JOptionPane.showInputDialog("Enter title: ");
            String body = JOptionPane.showInputDialog("Write here: ");
            diary.createEntry(title, body);
            JOptionPane.showInputDialog("Diary successfully created");
            JOptionPane.showInputDialog("""
                You id is
                """, diary.generateId());
        } catch (Exception e){
            JOptionPane.showInputDialog(e.getMessage());
            JOptionPane.showInputDialog("There was an error");
        }
        finally {
            displayMenu();
        }
    }

}
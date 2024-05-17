package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {
    private static List<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("================================");
            System.out.println("WELCOME");
            System.out.println("What would you like to");
            System.out.println("1. Add a new contact");
            System.out.println("2. Search for a contact");
            System.out.println("3. Delete a contact");
            System.out.println("4. Display all contacts");
            System.out.println("5. Exit");
            System.out.println("================================");
            int response = scanner.nextInt();

            switch (response) {
                case 1:
                    System.out.println("Enter first name");
                    String firstName = scanner.next();
                    System.out.println("Enter last name");
                    String lastName = scanner.next();
                    System.out.println("Enter phone number");
                    String phoneNumber = scanner.next();
                    addContact(firstName, lastName, phoneNumber);
                    break;
                case 2:
                    System.out.println("Enter name to search with");
                    String name = scanner.next();
                    searchContact(name);
                    break;
//                case 3:
//                    deleteContact();
//                    break;
                case 4:
                    displayContacts();
                    break;
//                case 5:
//                    System.exit(0);
//                    break;
                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
        }

    }

    public static void addContact(String firstname, String lastname, String phoneNumber){
        Contact contact = new Contact(firstname, lastname, phoneNumber);
        contacts.add(contact);
    }
    public static void removeContact(String firstname, String lastname, String phoneNumber){
        Contact contact = new Contact(firstname, lastname, phoneNumber);
        contacts.remove(contact);
    }
    public static void searchContact(String name){
        for (Contact contact : contacts){
            if (contact.getFirstname().equals(name) || contact.getLastname().equals(name)){
                System.out.println(contact);
            }
        }
    }

    public static void displayContacts(){

        if (contacts.isEmpty()) System.out.println("Your contact is empty");
        else System.out.println("Here are all your contacts");

        System.out.println("=".repeat(30));
        for(Contact contact : contacts){
            System.out.println(contact);
        }
        System.out.println("=".repeat(30));
    }
}

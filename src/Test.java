import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {

    // phonebook
    private static Map<String, String> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPhone Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. find All contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    searchContact(scanner);
                    break;
                case 3:
                    findAllContacts();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void addContact(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        phoneBook.put(name, phoneNumber);
        System.out.println("Contact added successfully.");
    }

    private static void searchContact(Scanner scanner) {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        String phoneNumber = phoneBook.get(name);
        if (phoneNumber != null) {
            System.out.println("Phone number for " + name + ": " + phoneNumber);
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void findAllContacts() {
        if (phoneBook.isEmpty()) {
            System.out.println("Phone book is empty.");
            return;
        }

        System.out.println("All Contacts:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }

}


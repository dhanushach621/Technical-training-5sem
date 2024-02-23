
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a contact");
            System.out.println("2. Lookup a contact");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.put(name, phoneNumber);
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    System.out.print("Enter name to lookup: ");
                    String lookupName = scanner.nextLine();
                    String foundNumber = phoneBook.get(lookupName);
                    if (foundNumber != null) {
                        System.out.println("Phone number: " + foundNumber);
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }
    }
}

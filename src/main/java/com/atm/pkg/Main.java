package src.main.java.com.atm.pkg;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, User> users = new HashMap<>();
        users.put("sumit", new User("sumit", "1234", 1000));
        users.put("bhakta", new User("bhakta", "1204", 2000));

        ATM atm = new ATM(users);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");
        System.out.print("Enter your user ID: ");
        String userID = scanner.next();
        System.out.print("Enter your PIN: ");
        String userPIN = scanner.next();

        if (users.containsKey(userID) && users.get(userID).getUserPIN().equals(userPIN)) {
            System.out.println("Authentication successful.");
            int choice;
            do {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your balance is: " + atm.checkBalance(userID));
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdraw(userID, withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter the amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(userID, depositAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        break;
                }
            } while (choice != 4);
        } else {
            System.out.println("Authentication failed. Please check your credentials.");
        }
        scanner.close();
    }
}
package net.doole;

import net.doole.banking.Users;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(Users user : Users.getPeople()) {
            System.out.println(user.getFormattedOutput());
        }

        System.out.println("\nChoose a user by index (0-9) to modify funds:");
        int index = scanner.nextInt();

        if (index >= 0 && index < Users.getPeople().size()) {
            Users selectedUser = Users.getPeople().get(index);

            //  Add funds
            System.out.println("Enter amount to add: ");
            double addAmount = scanner.nextDouble();
            selectedUser.addFunds(addAmount);

            //  Ask if you want to remove funds
            System.out.println("Do you want to remove funds? (yes/no): ");
            String removeChoice = scanner.next().toLowerCase();

            if (removeChoice.equals("yes") || removeChoice.equals("y")) {
                System.out.println("Enter amount to remove: ");
                double removeAmount = scanner.nextDouble();
                selectedUser.removeFunds(removeAmount);
            } else {
                System.out.println("No funds removed.");
            }

            //  Display updated balance
            System.out.println("\nUpdated Balance:");
            System.out.println(selectedUser.getFormattedOutput());

        } else {
            System.out.println("Invalid index.");
        }
        scanner.close();

        System.out.println("All accounts.");

        for(Users user : Users.getPeople()) {
            System.out.println(user.getFormattedOutput());
        }


    }
}
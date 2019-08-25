package a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1Novice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Your code follows here.
        List<String> outputs = new ArrayList<>();
        int totalCustomers = scan.nextInt();

        // Main loop for getting customer information.
        for (int i = 0; i < totalCustomers; i++) {
            String firstName = scan.next();
            String lastName = scan.next();

            // Obtains item data inputs and tracks total cost.
            int itemsPurchased = scan.nextInt();
            double totalCost = 0.0;

            for (int j = 0; j < itemsPurchased; j++) {
                int itemQuantity = scan.nextInt();
                String itemName = scan.next();
                double itemPrice = scan.nextDouble();

                totalCost += itemQuantity * itemPrice;
            }

            // Output string construction and storage.
            String outputString = String.valueOf(firstName.charAt(0)) + ". " + lastName + ": " + String.format("%.2f", totalCost);
            outputs.add(outputString);
        }

        // Print loop.
        for (String str : outputs) {
            System.out.println(str);
        }
    }
}

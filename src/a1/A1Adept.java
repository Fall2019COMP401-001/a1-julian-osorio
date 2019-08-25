package a1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A1Adept {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Your code follows here.

        Map<String, Double> items = new HashMap<String, Double>();

        // Obtains and stores item data.
        int itemsInStore = scan.nextInt();
        for (int i = 0; i < itemsInStore; i++) {
            String itemName = scan.next();
            double itemPrice = scan.nextDouble();
            items.put(itemName.toLowerCase(), itemPrice);
        }

        // Set max and min ceiling/floor.
        double biggest = Double.MIN_VALUE;
        double smallest = Double.MAX_VALUE;

        String biggestOutput = "";
        String smallestOutput = "";

        // Customer information loop.
        int numberOfCustomers = scan.nextInt();
        double allCustomerTotal = 0.0;
        for (int i = 0; i < numberOfCustomers; i++) {
            String firstName = scan.next();
            String lastName = scan.next();

            // Obtains customer's item purchases.
            int itemsPurchased = scan.nextInt();
            double totalCost = 0.0;
            for (int j = 0; j < itemsPurchased; j++) {
                int itemQuantityPurchased = scan.nextInt();
                String itemName = scan.next();
                totalCost += items.get(itemName.toLowerCase()) * itemQuantityPurchased;
            }

            allCustomerTotal += totalCost;

            // Evaluate if there is a new biggest or smallest value.
            if (totalCost > biggest) {
                biggest = totalCost;
                biggestOutput = "Biggest: " + firstName + ' ' + lastName + " (" + String.format("%.2f", totalCost) + ')';
            }
            if (totalCost < smallest) {
                smallest = totalCost;
                smallestOutput = "Smallest: " + firstName + ' ' + lastName + " (" + String.format("%.2f", totalCost) + ')';
            }
        }

        // Calculate average.
        double average = allCustomerTotal / (double) numberOfCustomers;

        //Outputs.
        System.out.println(biggestOutput);
        System.out.println(smallestOutput);
        System.out.println("Average: " + String.format("%.2f", average));

    }
}

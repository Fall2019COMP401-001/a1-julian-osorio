package a1;

import java.util.*;

public class A1Jedi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Your code follows here.

        // ARRAY USAGE DETAILS
        // Index 0: Number of customers who purchased item.
        // Index 1: Quantity of item purchased.
        Map<String, int[]> items = new TreeMap<>();

        // Obtains item data.
        int itemsInStore = scan.nextInt();
        for (int i = 0; i < itemsInStore; i++) {
            String itemName = scan.next();
            double itemPrice = scan.nextDouble();
            items.put(itemName, new int[]{0, 0});
        }

        // Main loop for customer information.
        int numberOfCustomers = scan.nextInt();
        for (int i = 0; i < numberOfCustomers; i++) {
            String firstName = scan.next();
            String lastName = scan.next();

            // Obtains customer's item purchases.
            int itemsPurchased = scan.nextInt();
            for (int j = 0; j < itemsPurchased; j++) {
                int itemQuantityPurchased = scan.nextInt();
                String itemName = scan.next();

                // Update item data.
                items.get(itemName)[0]++;
                items.get(itemName)[1] += itemQuantityPurchased;
            }
        }

        // Outputs.
        for (Map.Entry<String, int[]> item : items.entrySet()) {
            if (item.getValue()[0] == 0) {
                System.out.println("No customers bought " + item.getKey());
            } else {
                System.out.println(item.getValue()[0] + " customers bought " + item.getValue()[1] + ' ' + item.getKey());
            }
        }
    }
}

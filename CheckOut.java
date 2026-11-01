import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean keepGoing = true;

        do {
            // Get item price
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            totalCost += itemPrice;

            // Ask if they have more items using getYNConfirm
            keepGoing = SafeInput.getYNConfirm(in, "Do you have another item");

        } while (keepGoing);

        // Display the total cost
        System.out.printf("\nYour total cost is: $%.2f\n", totalCost);
    }
}
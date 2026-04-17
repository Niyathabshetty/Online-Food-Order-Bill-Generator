import java.util.*;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = {"Pizza", "Burger", "Pasta"};
        int[] prices = {200, 100, 150};

        double total = 0;

        while (true) {
            System.out.println("\nMenu:");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i + 1) + ". " + items[i] + " - Rs." + prices[i]);
            }

            System.out.print("Choose item (1-3, 0 to exit): ");
            int choice = sc.nextInt();

            if (choice == 0) break;

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            total += prices[choice - 1] * qty;
        }

        double gst = total * 0.05;
        double finalAmount = total + gst;

        System.out.println("\nTotal: Rs." + total);
        System.out.println("GST (5%): Rs." + gst);
        System.out.println("Final Bill: Rs." + finalAmount);
    }
}
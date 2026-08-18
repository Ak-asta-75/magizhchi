package inner_class;
import java.util.Scanner;

public class ShoppingCart {
    String cartOwnerName;
    class Item {
        String itemName;
        double price;
        int quantity;
        double[] priceHistory;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        ShoppingCart.Item item = null;

        while (true) {
            System.out.println("--- MENU ---");
            System.out.println("1. Add Item");
            System.out.println("2. Update Price History");
            System.out.println("3. Display Cart Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    item = cart.new Item();
                    scanner.nextLine(); // Clear newline buffer
                    System.out.print("Enter Cart Owner Name: ");
                    cart.cartOwnerName = scanner.nextLine();
                    System.out.print("Enter Item Name: ");
                    item.itemName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    item.quantity = scanner.nextInt();
                    System.out.print("Enter Number of Price Updates: ");
                    int updateCount = scanner.nextInt();
                    item.priceHistory = new double[updateCount];
                    System.out.println("Item added successfully.");
                    break;

                case 2:
                    if (item == null || item.priceHistory == null) {
                        System.out.println("Please add an item first!");
                        break;
                    }
                    System.out.println("Enter Prices:");
                    for (int i = 0; i < item.priceHistory.length; i++) {
                        item.priceHistory[i] = scanner.nextDouble();
                    }
                    // Set latest price to the last entry in price history
                    item.price = item.priceHistory[item.priceHistory.length - 1];
                    System.out.println("Price history updated successfully.");
                    break;

                case 3:
                    if (item == null || item.priceHistory == null) {
                        System.out.println("Cart is empty or price history is missing!");
                        break;
                    }
                    double totalBill = item.price * item.quantity;

                    System.out.println("------------------------------------");
                    System.out.println("Cart Owner: " + cart.cartOwnerName);
                    System.out.println("Item Name: " + item.itemName);
                    System.out.println("Quantity: " + item.quantity);
                    
                    System.out.print("Price History: ");
                    for (double p : item.priceHistory) {
                        System.out.print((int) p + " ");
                    }
                    System.out.println();

                    System.out.println("Latest Price: " + (int) item.price);
                    System.out.println("Total Bill: " + (int) totalBill);
                    System.out.println("------------------------------------");
                    break;

                case 4:
                    System.out.println("Exiting application...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Choice must be between 1 and 4.");
            }
        }
    }
}
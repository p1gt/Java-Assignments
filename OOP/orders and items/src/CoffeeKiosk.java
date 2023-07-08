import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {
    private final ArrayList<Item> menu;
    private final ArrayList<Order> orders;

    public CoffeeKiosk() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price);
        item.setIndex(menu.size() + 1);
        menu.add(item);
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (Item item : menu) {
            System.out.println(item.getIndex() + ". " + item.getName() + " $" + item.getPrice());
        }
    }

    public void newOrder() {
        System.out.println("Please enter the customer's name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Order order = new Order(name);
        orders.add(order);
        displayMenu();
        System.out.println("Enter the item number to add to the order, or 'q' to complete the order:");
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("q")) {
            try {
                int itemNumber = Integer.parseInt(input);
                if (itemNumber >= 1 && itemNumber <= menu.size()) {
                    Item item = menu.get(itemNumber - 1);
                    order.addItem(item);
                    System.out.println("Enter the item number to add to the order, or 'q' to complete the order:");
                } else {
                    System.out.println("Invalid item number. Please try again:");
                }
                input = scanner.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again:");
                input = scanner.nextLine();
            }
        }

        System.out.println("Order for " + name + ":");
        order.display();
        scanner.close();
    }
}

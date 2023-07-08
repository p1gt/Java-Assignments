import java.util.*;

public class CoffeeKiosk {
    ArrayList<Item> menu;
    ArrayList<Order> orders;

    public CoffeeKiosk() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price);
        menu.add(item);
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (Item item : menu) {
            System.out.println(item.getIndex() + ". " + item.getName() + " $" + item.getPrice());
        }
    }

    public void newOrder() {
        System.out.println("please enter customer name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Order order = new Order(name);
        orders.add(order);
        displayMenu();
        System.out.println("enter item number to add to order, q to complete order:");
        int itemNumber = scanner.nextInt();
        while (itemNumber != 'q') {
            Item item = menu.get(itemNumber - 1);
            order.addItem(item);
            System.out.println("enter item number to add to order, q to complete order:");
            itemNumber = scanner.nextInt();
        }

        System.out.println("Order for " + name + ":");
        order.display();
    }
}
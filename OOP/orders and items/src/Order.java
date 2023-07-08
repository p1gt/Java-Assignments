import java.util.ArrayList;

public class Order {
    private String name;
    private final ArrayList<Item> items;

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public double getOrderTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer Name: " + name);
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }
}

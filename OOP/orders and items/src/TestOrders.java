public class TestOrders {
    public static void main(String[] args) {
        // create 2 orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();

        // create 3 orders with names
        Order order3 = new Order("Cindy");
        Order order4 = new Order("John");
        Order order5 = new Order("Mary");

        // add items to orders
        Item item1 = new Item("drip coffee", 1.50);
        Item item2 = new Item("cappuccino", 3.50);
        Item item3 = new Item("latte", 4.0);
        Item item4 = new Item("bagel", 2.0);
        Item item5 = new Item("muffin", 2.5);

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);
        order2.addItem(item5);

        order3.addItem(item1);
        order3.addItem(item2);

        order4.addItem(item3);
        order4.addItem(item4);

        order5.addItem(item1);
        order5.addItem(item5);

        // test display method
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        // test CoffeeKiosk class
        CoffeeKiosk kiosk = new CoffeeKiosk();
        kiosk.addMenuItem("drip coffee", 1.50);
        kiosk.addMenuItem("cappuccino", 3.50);
        kiosk.addMenuItem("latte", 4.0);
        kiosk.addMenuItem("bagel", 2.0);
        kiosk.addMenuItem("muffin", 2.5);
        kiosk.newOrder();
    }
}
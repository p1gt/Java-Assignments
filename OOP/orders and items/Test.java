public class Test {
    public static void main(String[] args) {
        Items item0 = new Items();
        Items item1 = new Items();
        Items item2 = new Items();
        Items item3 = new Items();

        item0.name = "Coffee";
        item0.price = 1.99;
        item1.name = "Sandwich";
        item1.price = 2.99;
        item2.name = "Chips";
        item2.price = 0.99;
        item3.name = "Soda";
        item3.price = 1.50;

        Orders order0 = new Orders();
        Orders order1 = new Orders();
        Orders order2 = new Orders();
        Orders order3 = new Orders();

        order0.name = "Cindhuri";
        order1.name = "Jimmy";
        order2.name = "Noah";
        order3.name = "Sam";

        order2.items.add(item1);
        order3.items.add(item0);
        order0.items.add(item2);
        order0.ready = true;
        order3.items.add(item2);
        order1.ready = true;
    }
}
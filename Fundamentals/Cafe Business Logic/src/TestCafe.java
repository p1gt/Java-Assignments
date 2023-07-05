import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeUtil = new CafeUtil();

        int weeks = cafeUtil.getStreakGoal(10);
        System.out.println(weeks);

        double[] prices = {3.5, 1.5, 4.0, 4.5};
        double total = cafeUtil.getOrderTotal(prices);
        System.out.println(total);

        ArrayList<String> menu = new ArrayList<>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        menu.add("americano");
        cafeUtil.displayMenu(menu);
        ArrayList<String> customers = new ArrayList<>();
        cafeUtil.addCustomer(customers);
    }
}
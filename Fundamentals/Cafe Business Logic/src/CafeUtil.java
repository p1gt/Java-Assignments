import java.util.*;

public class CafeUtil {
    int getStreakGoal(int weeks) {
        int sum = 0;
        for (int week = 1; week <= weeks; week++) {
            sum += week;
        }
        return sum;
    }

    double getOrderTotal(double[] prices) {
        int sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }

    void displayMenu(ArrayList<String> items) {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i+1 + ". " + items.get(i));
        }
    }

    void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Hello, " + name + "!");
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(name);
    }
}
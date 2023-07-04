public class Main {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables
        double dripCoffeePrice = 2.0;
        double lattePrice = 3.5;
        double cappuccinoPrice = 3.0;

        // Customer variables
        String sam = "Sam";
        String jimmy = "Jimmy";
        String noah = "Noah";

        // Order completions
        boolean isReadySam = false;
        boolean isReadyJimmy = true;
        boolean isReadyNoah = false;

        // APP INTERACTION SIMULATION
        System.out.println(generalGreeting + sam); // Displays "Welcome to Cafe Java, Sam"
        double samOrderTotal = 2 * lattePrice;
        System.out.println(displayTotalMessage + samOrderTotal); // Displays "Your total is $7.0"
        if (isReadySam) {
            System.out.println(sam + readyMessage); // Displays "Sam, your order is ready"
        } else {
            System.out.println(sam + pendingMessage); // Displays "Sam, your order will be ready shortly"
        }

        System.out.println(generalGreeting + noah); // Displays "Welcome to Cafe Java, Noah"
        double noahOrderTotal = cappuccinoPrice;
        if (isReadyNoah) {
            System.out.println(noah + readyMessage); // Displays "Noah, your order is ready"
            System.out.println(displayTotalMessage + noahOrderTotal); // Displays "Your total is $3.0"
        } else {
            System.out.println(noah + pendingMessage); // Displays "Noah, your order will be ready shortly"
        }

        System.out.println(generalGreeting + jimmy); // Displays "Welcome to Cafe Java, Jimmy"
        double jimmyOrderTotal = lattePrice;
        System.out.println(displayTotalMessage + jimmyOrderTotal); // Displays "Your total is $3.5"
        jimmyOrderTotal -= dripCoffeePrice; // Jimmy realizes he ordered a latte, but was charged for a coffee
        System.out.println(displayTotalMessage + jimmyOrderTotal); // Displays "Your total is $2.5"
        if (isReadyJimmy) {
            System.out.println(jimmy + readyMessage); // Displays "Jimmy, your order is ready"
        } else {
            System.out.println(jimmy + pendingMessage); // Displays "Jimmy, your order will be ready shortly"
        }
    }
}
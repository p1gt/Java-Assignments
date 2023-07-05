import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(10);
        list.add("Hello");

        for (int i = 0; i < list.size(); i++) {
            try {
                Object item = list.get(i);
                Integer number = (Integer) item;
                System.out.println("Item at index " + i + " is an Integer: " + number);
            } catch (ClassCastException e) {
                System.out.println("Error: ClassCastException occurred at index " + i);
                System.out.println("Object value: " + list.get(i));
            }
        }
    }
}

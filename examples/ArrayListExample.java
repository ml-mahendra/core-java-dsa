import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Object> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add(5);
        fruits.add(8.9);
        System.out.println("ArrayList: " + fruits);

        // Access element by index (fast)
        System.out.println("Second element: " + fruits.get(1));

        // Insert at index 1 (slow – shifts elements)
        fruits.add(1,"Mango");
        System.out.println("After insertion: " + fruits);
    }
}

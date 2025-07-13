package ArrayList.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Fruits {

    public static void main(String[] args) {

        // Step 1: Create LinkedList and add fruits
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Step 2: Insert Orange at index 1
        fruits.add(1, "Orange");

        // Step 3: Print the final list
        System.out.println("Fruits List: " + fruits);
    }
}

package ArrayList.List;

import java.util.ArrayList;
import java.util.Collections;

public class Reversed {
    public static void main(String[] args) {

        // Use ArrayList of Integer (object type, not primitive int)
        ArrayList<Integer> arraylist = new ArrayList<>();

        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        arraylist.add(40);
        arraylist.add(50);

        System.out.println("Original List: " + arraylist);

        // 🔁 Reverse the list
        Collections.reverse(arraylist);

        System.out.println("Reversed List: " + arraylist);
    }
}

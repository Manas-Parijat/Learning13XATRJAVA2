package ArrayList.List;

import java.util.ArrayList;
import java.util.Collections;

public class Stu {

    public static void main(String[] args) {

        ArrayList<String> arraylist = new ArrayList<>(); // Specify type

        arraylist.add("David");
        arraylist.add("Rahul");
        arraylist.add("Priya");
        arraylist.add("Anjali");

        System.out.println(arraylist); // Print the ArrayList
    }

    public static class Reversed {
        public static void main(String[] args) {

            // Use ArrayList of Integer (object type, not primitive int)
            ArrayList<Integer> arraylist = new ArrayList<>();

            arraylist.add(10);
            arraylist.add(20);
            arraylist.add(30);
            arraylist.add(40);
            arraylist.add(40);
            arraylist.add(50);

            System.out.println(arraylist);

            // 🔁 Reverse the list
            Collections.reverse(arraylist);

            System.out.println(arraylist);
        }
    }
}


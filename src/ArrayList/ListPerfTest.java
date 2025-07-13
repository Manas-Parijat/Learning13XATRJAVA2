package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerfTest {

    public static void main(String[] args) {

        // Step 1: Create ArrayList and LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Step 2: Measure time for ArrayList
        long arrayStart = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        long arrayEnd = System.currentTimeMillis();
        long arrayDuration = arrayEnd - arrayStart;

        // Step 3: Measure time for LinkedList
        long linkedStart = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        long linkedEnd = System.currentTimeMillis();
        long linkedDuration = linkedEnd - linkedStart;

        // Step 4: Print time taken
        System.out.println("ArrayList time: " + arrayDuration + " ms");
        System.out.println("LinkedList time: " + linkedDuration + " ms");
    }
}


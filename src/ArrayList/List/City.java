package ArrayList.List;

import java.util.ArrayList;
import java.util.Scanner;

public class City {

    public static void main(String[] args) {

        // Step 1: Create the ArrayList and add cities
        ArrayList<String> areaList = new ArrayList<>();
        areaList.add("Mumbai");
        areaList.add("Pune");
        areaList.add("Delhi");

        System.out.println("City List: " + areaList);

        // Step 2: Check if Pune is in the list
        if (areaList.contains("Pune")) {
            System.out.println(" Pune is  in the city list.");
        } else {
            System.out.println(" Pune is not in the city list.");
        }

        // Step 3: Take city name from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a city name to check: ");
        String userCity = scanner.nextLine();

        // Step 4: Check if user input is in the list
        if (areaList.contains(userCity)) {
            System.out.println(" is  in the city list.");
        } else {
            System.out.println(" is not  in the city list.");
        }

        scanner.close();
    }
}

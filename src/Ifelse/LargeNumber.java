package Ifelse;

import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //take a intput

        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number");
        int num3 = scanner.nextInt();

        //use if eles

        int largest;

        if (num1 > num2) {
            if (num1 > num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 > num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
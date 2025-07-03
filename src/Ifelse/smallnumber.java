package Ifelse;

import java.util.Scanner;

    public class smallnumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter third number: ");
            int num3 = scanner.nextInt();

            int smallest;

            // Using if-else
            if(num1 < num2) {
                if(num1 < num3) {
                    smallest = num1;
                } else {
                    smallest = num3;
                }
            } else {
                if(num2 < num3) {
                    smallest = num2;
                } else {
                    smallest = num3;
                }
            }

            System.out.println("The smallest number is: " + smallest);
        }
    }



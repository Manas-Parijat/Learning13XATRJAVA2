package Ifelse;

import java.util.Scanner;

public class PalindromeNumber {

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return originalNum == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check palindrome using method
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        sc.close();
    }
}

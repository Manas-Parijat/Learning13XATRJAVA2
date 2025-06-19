package javaprogram;

public class javatest {
    public static void main(String[] args) {
        {
            System.out.println("=== Arithmetic Operators ===");

            int a = 10;
            int b = 5;

            System.out.println("a = " + a + ", b = " + b);
            System.out.println("Addition (a + b): " + (a + b));
            System.out.println("Subtraction (a - b): " + (a - b));
            System.out.println("Multiplication (a * b): " + (a * b));
            System.out.println("Division (a / b): " + (a / b));
            System.out.println("Modulus (a % b): " + (a % b));

            System.out.println("\n=== Assignment Operators ===");

            int x;
            x = 10;
            System.out.println("x = 10 ➜ " + x);

            x += 5; // x = x + 5
            System.out.println("x += 5 ➜ " + x);


            x -= 5; // x = x - 3
            System.out.println("x -= 5 ➜ " + x);

            // Multiplication assignment
            x *= 5; // x = x * 2
            System.out.println("x *= 5 ➜ " + x);

            // Division assignment
            x /= 5; // x = x / 4
            System.out.println("x /= 5 ➜ " + x);

            // Modulus assignment
            x %= 3; // x = x % 3
            System.out.println("x %= 3 ➜ " + x);
        }
    }
}

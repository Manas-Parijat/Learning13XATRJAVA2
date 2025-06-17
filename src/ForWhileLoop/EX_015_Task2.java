package ForWhileLoop;

public class EX_015_Task2 {
    public static void main(String[] args) {
        String str = "madam";

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }
    }
}

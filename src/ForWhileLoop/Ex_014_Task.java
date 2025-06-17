package ForWhileLoop;

public class Ex_014_Task {
    public static void main(String[] args) {
        String input = "manas";
        int vowels = 0, consonants = 0;

        char[] chars = input.toLowerCase().toCharArray();

        for (char ch : chars) {
            if (ch >= 'a' && ch <= 'z') {
                switch (ch) {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                        vowels++;
                        break;
                    default:
                        consonants++;
                        break;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}


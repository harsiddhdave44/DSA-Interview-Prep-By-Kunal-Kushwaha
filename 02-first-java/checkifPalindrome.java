import java.util.Scanner;

public class checkifPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string to check if it is palindrome:\t");
        String str = input.next();

        input.close();

        for (int i = 0, j = str.length() - 1; i <= str.length() / 2 && j >= str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("It is not a palindrome");
                return;
            }
        }
        System.out.println("It is a palindrome");
    }
}

// abba
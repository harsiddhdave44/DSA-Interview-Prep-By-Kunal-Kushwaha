import java.util.Scanner;

public class twoNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int numOne = input.nextInt();

        System.out.println("Enter second number: ");
        int numTwo = input.nextInt();

        input.close();

        System.out.println("Sum is " + (numOne + numTwo));
    }
}

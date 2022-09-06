import java.util.Scanner;

public class twoNumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:\t");
        int numOne = input.nextInt();

        System.out.println("Enter second number:\t");
        int numTwo = input.nextInt();

        System.out.println("Enter the operator:\t");
        char operator = input.next().charAt(0);

        if (operator == '+')
            System.out.println(numOne + numTwo);

        if (operator == '-')
            System.out.println(numOne - numTwo);

        if (operator == '*')
            System.out.println(numOne * numTwo);

        if (operator == '/')
            System.out.println(numOne / numTwo);

        input.close();
    }
}

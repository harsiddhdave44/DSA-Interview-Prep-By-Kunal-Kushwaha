import java.util.Scanner;

public class findLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:\t");
        double numOne = input.nextDouble();

        System.out.println("Enter second number:\t");
        double numTwo = input.nextDouble();

        input.close();

        if (numOne > numTwo)
            System.out.println(String.format("%d is larger", numOne));
        else
            System.out.println(String.format("%d is larger", numOne));
    }
}

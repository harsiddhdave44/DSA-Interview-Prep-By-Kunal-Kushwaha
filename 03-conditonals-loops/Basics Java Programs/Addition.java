import java.util.Scanner;

/**
 * Addition
 */
public class Addition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int numberOne = input.nextInt();

        System.out.println("Enter number two: ");
        int numberTwo = input.nextInt();

        input.close();

        System.out.println("Addition is " + (numberOne + numberTwo));
    }
}
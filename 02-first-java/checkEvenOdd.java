import java.util.Scanner;

public class checkEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check whether it is even or odd:\t");
        int num = input.nextInt();

        input.close();

        if (num % 2 == 0)
            System.out.println(String.format("%d is Even number", num));
        else if (num % 3 == 0)
            System.out.println(String.format("%d is Odd number", num));
    }
}

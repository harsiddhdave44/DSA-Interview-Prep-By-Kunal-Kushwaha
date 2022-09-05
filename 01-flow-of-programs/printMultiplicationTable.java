import java.util.Scanner;

public class printMultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to print its multiplication table: ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", number, i, (number * i)));
        }

        input.close();
    }
}

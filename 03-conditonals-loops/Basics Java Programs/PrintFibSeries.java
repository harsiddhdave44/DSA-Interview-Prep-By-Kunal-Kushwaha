import java.util.Scanner;

/*
 * Print Fibonacci series
 */

public class PrintFibSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        input.close();

        int a = 0;
        int b = 1;
        System.out.print(a + ", " + b + ", ");

        // Each value in Fibonacci series is calculated by summing up the last two
        // numbers, i.e., , 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 and so on...
        for (int i = 0; i < n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
            System.out.print(b + ", ");
        }
    }
}

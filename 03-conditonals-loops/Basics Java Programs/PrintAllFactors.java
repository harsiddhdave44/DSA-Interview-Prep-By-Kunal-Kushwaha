import java.util.Scanner;

public class PrintAllFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to find factors for: ");
        int number = input.nextInt();

        input.close();
        int i = 1;
        while (i <= ((int) Math.sqrt(number))) {
            // A number is considered to be a factor of an value if value % number==0
            if (number % i == 0) {
                System.out.print(i + ", " + number / i + ", ");
            }
            i++;
        }
    }
}

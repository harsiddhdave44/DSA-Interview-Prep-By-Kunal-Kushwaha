import java.util.Scanner;

public class calculateSimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal amount:\t");
        double principal = input.nextDouble();

        System.out.println("Enter the rate of interest per year:\t");
        double roi = input.nextDouble();

        System.out.println("Enter the time period in years:\t");
        int yearCount = input.nextInt();

        input.close();

        double simple_interest_amount = ((principal * roi) / 100) * yearCount;

        System.out.println(String.format("Interest accrued with %.2f is %.2f. Total amount will be: %.2f", principal,
                simple_interest_amount, (principal + simple_interest_amount)));
    }
}

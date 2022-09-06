import java.util.Scanner;

public class INR_to_USD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter INR:\t");
        double inr = input.nextDouble();

        input.close();

        System.out.println(String.format("INR %f = %f USD", inr, (inr / 80.05)));
    }
}

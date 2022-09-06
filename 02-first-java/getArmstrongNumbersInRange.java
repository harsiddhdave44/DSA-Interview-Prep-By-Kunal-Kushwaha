import java.util.Scanner;

public class getArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter lower bound:\t");
        int numOne = input.nextInt();

        System.out.println("Enter upper bound:\t");
        int numTwo = input.nextInt();

        input.close();

        for (int i = Math.min(numOne, numTwo); i < Math.max(numOne, numTwo); i++) {
            if (checkIfArmstrong(i))
                System.out.println(String.format("%d is an Armstrong number", i));
        }
    }

    private static boolean checkIfArmstrong(int i) {
        int temp = i;
        int digitCount = String.valueOf(temp).length();
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digitCount);
            temp = temp / 10;
        }
        if (i == sum)
            return true;
        return false;
    }
}

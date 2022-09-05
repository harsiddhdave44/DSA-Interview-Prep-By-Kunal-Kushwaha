import java.util.Scanner;

public class findHcfAndLcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int numberOne = input.nextInt();

        System.out.println("Enter the second number: ");
        int numberTwo = input.nextInt();

        input.close();

        double hcf = findHCF(numberOne, numberTwo);
        double lcm = findLCM(numberOne, numberTwo);

        System.out.println(String.format("HCF of %d and %d is %.2f", numberOne, numberTwo, hcf));
        System.out.println(String.format("LCM of %d and %d is %.2f", numberOne, numberTwo, lcm));
    }

    static int findHCF(int numOne, int numTwo) {
        int min = Math.min(numOne, numTwo);
        int hcf = 0;
        for (int i = 1; i <= min; i++) {
            if (numOne % i == 0 && numTwo % i == 0)
                hcf = i;
        }
        return hcf;
    }

    static double findLCM(int numOne, int numTwo) {
        return ((numOne * numTwo) / findHCF(numOne, numTwo));
    }
}

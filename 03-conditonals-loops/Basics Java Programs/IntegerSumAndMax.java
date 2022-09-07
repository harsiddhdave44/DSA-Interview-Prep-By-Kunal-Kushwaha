import java.util.Scanner;

public class IntegerSumAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        int max = 0;
        do {
            num = input.nextInt();
            sum += num;
            if (num > max)
                max = num;

        } while (num != 0);

        input.close();

        System.out.println(String.format("Thhe largest number of all is %d", max));
        System.out.println(String.format("Thhe sum of all is %d", sum));
    }
}

import java.util.Scanner;

public class sumOfNvalues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        String c;

        while (true) {
            System.out.print("Enter a number or an 'x'\t");
            c = input.next().trim();
            char ch = c.charAt(0);
            if (ch == 'x' || ch == 'X') {
                break;
            }
            sum += Integer.parseInt(c);
        }
        System.out.println(String.format("Sum is %f", sum));
        input.close();
    }
}

import java.util.Scanner;

public class greetUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: \t");
        String name = input.next();

        input.close();

        System.out.println("Jay shri Krishna " + name);
    }
}

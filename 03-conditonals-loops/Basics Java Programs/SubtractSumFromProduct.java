/*
* Subtract the Product and Sum of Digits of an Integer. 
* Link to LeetCode: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
*/

import java.util.Scanner;

public class SubtractSumFromProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:\t");
        int number = input.nextInt();

        input.close();

        int sum = 0;
        int product = 1;

        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp = temp / 10;
        }

        System.out.println(product - sum);
    }
}

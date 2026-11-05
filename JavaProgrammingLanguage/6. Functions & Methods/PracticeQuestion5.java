// Write a Java method to compute the sum of the digits in an integer.

import java.util.Scanner;

public class PracticeQuestion5 {

    public static int sumOfDigits(int x) {
        int sum = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            sum = sum + lastDigit;
            x = x / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        scanner.close();

        int result = sumOfDigits(number);

        System.out.println("Sum of the digits of the given number: " + result);
    }
}

// Write a Java program to check if a number is a palindrome in Java?

import java.util.Scanner;

public class PracticeQuestion3 {

    public static boolean idPalindrom(int x) {
        int original = x;
        int reverse = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        scanner.close();

        boolean result = idPalindrom(number);

        if (result == true) {
            System.out.println("Given number is Palindrom");
        } else {
            System.out.println("Given number is not Palindrom");
        }
    }
}

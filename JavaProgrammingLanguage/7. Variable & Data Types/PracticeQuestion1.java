// Question 1: In a program, input 3 numbers: A, B and C. You have to output the average of these 3 numbers.

import java.util.Scanner;

public class PracticeQuestion1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        double average = (a + b + c) / 3;

        System.out.println("Average of three number: " + average);
    }
}

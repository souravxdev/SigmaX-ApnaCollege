// Write a Java method to compute the average of three numbers.

import java.util.Scanner;

public class PracticeQuestion1 {

    public static double calcualteAverage(double x, double y, double z) {
        double average = (x + y + z) / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double thirdNumber = scanner.nextDouble();

        double average = calcualteAverage(firstNumber, secondNumber, thirdNumber);

        System.out.println("Average of given 3 numbers: " + average);

        scanner.close();
    }
}

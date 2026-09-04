import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String args[]) {
        // int a = 10, b = 5, sum = a + b;
        // System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number_1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number_2 = sc.nextInt();

        int sum = number_1 + number_2;
        System.out.println("Sum of two numbers: " + sum);
    }
}
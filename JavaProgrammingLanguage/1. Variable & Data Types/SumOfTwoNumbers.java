import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        // int a = 10, b = 5, sum = a + b;
        // System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number_1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number_2 = scanner.nextInt();

        int sum = number_1 + number_2;
        System.out.println("Sum of two numbers: " + sum);

        scanner.close();
    }
}

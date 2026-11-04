import java.util.Scanner;

public class ProductOfTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number_1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number_2 = sc.nextInt();

        int product = number_1 * number_2;
        System.out.println("Product of two numbers: " + product);
    }
}

import java.util.Scanner;

public class FactorialOfN {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        int factorial = factorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);

        scanner.close();
    }
}

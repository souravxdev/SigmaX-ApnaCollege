import java.util.Scanner;

public class BinomialCoefficient {

    public static int factorial(int n) {
        // user defined method
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binCoef(int n, int r) {
        // user defined method
        int factorialN = factorial(n);
        int factorialR = factorial(r);
        int factorialNMinusR = factorial(n - r);
        int binCof = factorialN / (factorialR * factorialNMinusR);

        return binCof;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt(); // nextInt() -> In build method
        System.out.print("Enter r: ");
        int r = scanner.nextInt();

        int binomialCoefficient = binCoef(n, r);
        System.out.println(
            "Binomial Coefficient of " + n + "C" + r + " is: " + binomialCoefficient
        );

        scanner.close();
    }
}

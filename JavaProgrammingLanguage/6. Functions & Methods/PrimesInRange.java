import java.util.Scanner;

public class PrimesInRange {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void primesInRange(int n) {
        System.out.print("Prime numbers from 2 to " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number < 0) {
            System.out.println("Invalid! Enter positive number.");
            return;
        }

        primesInRange(number);
    }
}

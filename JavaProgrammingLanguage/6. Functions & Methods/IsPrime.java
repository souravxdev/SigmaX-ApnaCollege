import java.util.Scanner;

public class IsPrime {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
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

        boolean result = isPrime(number);

        if (result == true) {
            System.out.println("Number " + number + " is prime.");
        } else {
            System.out.println("Number " + number + " is not prime.");
        }
    }
}

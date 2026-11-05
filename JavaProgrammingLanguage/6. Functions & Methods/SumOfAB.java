import java.util.Scanner;

public class SumOfAB {

    // public static void calculateSum() {
    // Scanner scanner = new Scanner(System.in);
    // int a = scanner.nextInt();
    // int b = scanner.nextInt();
    // int sum = a + b;
    // System.out.println("Sum: " + sum);
    // return;
    // }

    // public static void main(String args[]) {
    // calculateSum();
    // }
    // -------------------------------------------------------

    // public static void calculateSum(int x, int y) {
    // int sum = x + y;
    // System.out.println("Sum: " + sum);
    // return;
    // }

    // public static void main(String args[]) {
    // Scanner scanner = new Scanner(System.in);
    // int a = scanner.nextInt();
    // int b = scanner.nextInt();
    // calculateSum(a, b);
    // }
    // -------------------------------------------------------

    public static int calculateSum(int x, int y) {
        // parameters or formal parameters
        int summation = x + y;
        return summation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter first number: ");
        int b = scanner.nextInt();

        int sum = calculateSum(a, b); // arguments or actual parameters
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}

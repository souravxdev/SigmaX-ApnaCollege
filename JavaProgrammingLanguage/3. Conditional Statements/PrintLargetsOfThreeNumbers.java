import java.util.Scanner;

public class PrintLargetsOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A >= B && A >= C) {
            System.out.println("A is the largest of 3 numbers");
        } else if (B >= C) {
            System.out.println("B is the largest of 3 numbers");
        } else {
            System.out.println("C is the largest of 3 numbers");
        }

        scanner.close();
    }
}

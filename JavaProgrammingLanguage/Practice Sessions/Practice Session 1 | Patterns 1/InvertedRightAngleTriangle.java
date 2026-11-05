import java.util.Scanner;

public class InvertedRightAngleTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

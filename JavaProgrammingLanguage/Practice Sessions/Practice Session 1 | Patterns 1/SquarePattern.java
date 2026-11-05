import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row: ");
        int n = scanner.nextInt();
        System.out.print("Enter column: ");
        int m = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

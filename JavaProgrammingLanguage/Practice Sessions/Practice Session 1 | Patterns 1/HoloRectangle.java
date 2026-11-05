import java.util.Scanner;

public class HoloRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row: ");
        int n = scanner.nextInt();
        System.out.print("Enter column: ");
        int m = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

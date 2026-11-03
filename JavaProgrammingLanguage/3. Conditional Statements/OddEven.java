import java.util.*;

public class OddEven {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The entered number is Even.");
        } else {
            System.out.println("The entered number is Odd.");
        }

        scanner.close();
    }
}

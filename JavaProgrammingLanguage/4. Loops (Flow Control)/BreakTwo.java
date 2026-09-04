
// Keep entering numbers till user enters a multiple of 10
import java.util.*;

public class BreakTwo {
    public static void main(String args[]) {
        // while (true) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int number = sc.nextInt();

        // if (number % 10 == 0) {
        // System.out.println("Invalid! You have entered multiple of 10.");
        // break;
        // }

        // System.out.println("You have entered: " + number);

        // }

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter number: ");
            int number = sc.nextInt();

            if (number % 10 == 0) {
                System.out.println("Invalid! You have entered multiple of 10.");
                break;
            }

            System.out.println("You have entered: " + number);
        } while (true);

    }
}

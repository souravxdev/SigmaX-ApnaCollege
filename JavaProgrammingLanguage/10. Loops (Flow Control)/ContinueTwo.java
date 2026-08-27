
// Display all numbers entered by user except multiples of 10
import java.util.*;

public class ContinueTwo {
    public static void main(String args[]) {
        // while (true) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int number = sc.nextInt();

        // if (number % 10 == 0) {
        // System.out.println("Invalid! You have entered multiple of 10.");
        // continue;
        // }

        // System.out.println("You have entered: " + number);

        // }

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter number: ");
            int number = sc.nextInt();

            if (number % 10 == 0) {
                System.out.println("Invalid! You have entered multiple of 10.");
                continue;
            }

            System.out.println("You have entered: " + number);
        } while (true);

    }
}

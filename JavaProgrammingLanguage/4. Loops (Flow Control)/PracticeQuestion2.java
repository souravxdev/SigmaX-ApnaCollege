
// Question 2: Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
import java.util.*;

public class PracticeQuestion2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sumEven = 0, sumOdd = 0;
        int choice;

        do {
            System.out.print("Enter number: ");
            int number = sc.nextInt();

            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }

            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);

        sc.close();
    }
}

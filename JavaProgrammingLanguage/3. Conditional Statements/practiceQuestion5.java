// Question 5: Write a Java program that takes a year from the user and print whether that year is a leap year or not.
import java.util.*;

public class PracticeQuestion5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }

        scanner.close();
    }
}

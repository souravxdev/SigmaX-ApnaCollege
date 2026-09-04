
// Question 5: Write a Java program that takes a year from the user and print whether that year is a leap year or not.
import java.util.*;

public class practiceQuestion5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}

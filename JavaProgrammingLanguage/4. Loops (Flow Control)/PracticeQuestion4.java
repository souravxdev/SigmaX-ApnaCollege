// Question 4: Write a program to print the multiplication table of a number N, entered by the user.
import java.util.*;

public class PracticeQuestion4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        scanner.close();
    }
}

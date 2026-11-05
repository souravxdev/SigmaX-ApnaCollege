/* 
Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your method.
*/

import java.util.Scanner;

public class PracticeQuestion2 {

    public static boolean isEven(int x) {
        return x % 2 == 0 ? true : false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        scanner.close();

        boolean result = isEven(number);

        if (result == true) {
            System.out.println("Given number " + number + " is Even");
        } else {
            System.out.println("Given number " + number + " is Odd");
        }
    }
}

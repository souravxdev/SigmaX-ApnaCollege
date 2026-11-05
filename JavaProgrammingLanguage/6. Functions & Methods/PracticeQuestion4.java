/*
Search about(Google) & use the following methods of the Math class in Java:
a. Math.min( )
b. Math.max( )
c. Math.sqrt( )
d. Math.pow( )
e. Math.avg( )
f. Math.abs( )
*/

/*
Notes:
- Math is in java.lang, so no import is needed. All its methods are static,
  so call them on the class name: Math.min(...), not on an object.

a. Math.min(a, b)   -> returns the smaller of two numbers.      Math.min(5, 9)  = 5
b. Math.max(a, b)   -> returns the larger of two numbers.       Math.max(5, 9)  = 9
c. Math.sqrt(x)     -> returns the square root as a double.     Math.sqrt(25)   = 5.0
                       A negative input gives NaN (not a number).
d. Math.pow(b, e)   -> returns b raised to the power e (double). Math.pow(2, 3) = 8.0
                       Cast to int if needed: (int) Math.pow(2, 3) = 8
e. Math.avg()       -> does NOT exist in Java (compile error).
                       Work out the average yourself: (a + b) / 2.0
                       Use 2.0, not 2: int / int drops the decimal, (5 + 8) / 2 = 6, not 6.5.
f. Math.abs(x)      -> returns the absolute value (removes the minus sign). Math.abs(-7) = 7
*/

import java.util.Scanner;

public class PracticeQuestion4 {

    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        scanner.close();

        System.out.println("Math.min(" + a + ", " + b + ") = " + Math.min(a, b));
        System.out.println("Math.max(" + a + ", " + b + ") = " + Math.max(a, b));
        System.out.println("Math.sqrt(" + a + ") = " + Math.sqrt(a));
        System.out.println("Math.pow(" + a + ", " + b + ") = " + Math.pow(a, b));
        System.out.println("Average of " + a + " and " + b + " = " + average(a, b));
        System.out.println("Math.abs(" + a + ") = " + Math.abs(a));
    }
}

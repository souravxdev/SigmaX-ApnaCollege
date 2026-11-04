// Question 2: In a program, input the side of a square. You have to output the area of the square.

import java.util.Scanner;

public class PracticeQuestion2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side of the square: ");
        int side = scanner.nextInt();

        int squareArea = side * side;

        System.out.println("Area of the square: " + squareArea);

        scanner.close();
    }
}

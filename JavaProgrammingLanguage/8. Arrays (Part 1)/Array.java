import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        int marks[] = new int[100]; // array creation

        Scanner scanner = new Scanner(System.in);

        marks[0] = scanner.nextInt(); // input taken of an array
        marks[1] = scanner.nextInt();
        marks[2] = scanner.nextInt();

        System.out.println("Physics: " + marks[0]); // output of an array
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Math: " + marks[2]);

        // marks[2] = 100;
        marks[2] = marks[2] + 1;
        System.out.println("Math: " + marks[2]);

        int average = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Average: " + average);

        System.out.println("Length of marks array: " + marks.length);

    }
}

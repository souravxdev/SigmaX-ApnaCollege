import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Adult: Vote, Drive");
        } else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not adult");
        }

        scanner.close();
    }
}
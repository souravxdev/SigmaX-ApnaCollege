import java.util.*;

public class CalculatorSwitchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            case '/':
                System.out.println("Division: " + (a / b));
                break;
            case '%':
                System.out.println("Remainder: " + (a % b));
                break;
            default:
                System.out.println("Wrong Operator");
        }

    }
}
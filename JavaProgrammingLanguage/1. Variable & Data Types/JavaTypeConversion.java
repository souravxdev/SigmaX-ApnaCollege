import java.util.Scanner;

public class JavaTypeConversion {
    public static void main(String args[]) {
        // int a = 25;
        // long b = a;
        // System.out.println(b);

        long a = 25;
        int b = a;
        System.out.println(b);

        Scanner scanner = new Scanner(System.in);
        // float number = scanner.nextFloat();
        int number = scanner.nextFloat();
        System.out.println(number);
    }
}

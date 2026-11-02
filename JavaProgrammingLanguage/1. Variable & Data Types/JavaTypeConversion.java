import java.util.Scanner;

public class JavaTypeConversion {
    public static void main(String args[]) {
        // Type = Widening = Implicit Conversion
        // int a = 25;
        // long b = a; // Possible / type compatible && destination type > source type
        // (Accepted)
        // System.out.println(b);

        long a = 25;
        int b = a; // Not Possible / type compatible but destination type !> source type (Not
                   // Accepted)
        System.out.println(b);

        Scanner scanner = new Scanner(System.in);
        // float number = scanner.nextFloat();
        int number = scanner.nextFloat();
        System.out.println(number);

        scanner.close();
    }
}

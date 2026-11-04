import java.util.Scanner;

public class JavaInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String input = scanner.next(); // Captures everything before space; Best for
        // single word
        String input = scanner.nextLine(); // Captures everything with space; Best for multiple words
        System.out.println(input);

        int number = scanner.nextInt();
        System.out.println(number);

        float price = scanner.nextFloat();
        System.out.println(price);

        boolean status = scanner.nextBoolean();
        System.out.println(status);

        short small = scanner.nextShort();
        System.out.println(small);

        long large = scanner.nextLong();
        System.out.println(large);

        scanner.close();
    }
}

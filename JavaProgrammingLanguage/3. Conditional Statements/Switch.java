import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Burger");
                break;
            case 2:
                System.out.println("Pizza");
                break;
            case 3:
                System.out.println("Fries");
                break;
            default:
                System.out.println("Wake up from dream");
        }

        scanner.close();
    }
}

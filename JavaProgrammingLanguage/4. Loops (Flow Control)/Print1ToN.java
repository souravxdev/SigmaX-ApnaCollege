import java.util.*;

public class Print1ToN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter range: ");
        int range = scanner.nextInt();

        int counter = 1;

        System.out.print("1 to given range: ");
        while (counter <= range) {
            System.out.print(+counter + " ");
            counter++;
        }
        System.out.println();

        scanner.close();
    }
}

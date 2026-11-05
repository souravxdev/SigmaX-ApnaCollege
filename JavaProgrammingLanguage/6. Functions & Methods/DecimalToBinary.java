import java.util.*;

public class DecimalToBinary {

    public static void decToBin(int decNum) {
        int pow = 0;
        int biNum = 0;

        while (decNum > 0) {
            int remainder = decNum % 2;
            biNum = biNum + remainder * (int) Math.pow(10, pow);

            pow++;

            decNum = decNum / 2;
        }
        System.out.println("Binary of Decimal Number: " + biNum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int number = scanner.nextInt();

        decToBin(number);

        scanner.close();
    }
}

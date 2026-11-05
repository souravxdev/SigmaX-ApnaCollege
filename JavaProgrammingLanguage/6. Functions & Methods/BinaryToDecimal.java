import java.util.Scanner;

public class BinaryToDecimal {

    public static void binTodec(int binNum) {
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + lastDigit * (int) Math.pow(2, pow);

            pow++;

            binNum = binNum / 10;
        }
        System.out.println("Decimal of Binary Number: " + decNum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int number = scanner.nextInt();

        binTodec(number);

        scanner.close();
    }
}

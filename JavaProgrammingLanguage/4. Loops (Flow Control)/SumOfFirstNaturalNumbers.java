import java.util.Scanner;

public class SumOfFirstNaturalNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " numbers: " + sum);
    }
}

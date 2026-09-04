import java.util.Scanner;

public class PrintLargetsOfThreeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if ((A >= B) && (A >= C)) {
            System.out.println("A is the largest of 3 numbers");
        } else if ((B >= C)) {
            System.out.println("B is the largest of 3 numbers");
        } else {
            System.out.println("C is the largest of 3 numbers");
        }
    }
}

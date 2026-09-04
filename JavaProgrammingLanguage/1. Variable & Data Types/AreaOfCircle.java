import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[]) {
        float PI = 3.1416f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();

        float area = PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

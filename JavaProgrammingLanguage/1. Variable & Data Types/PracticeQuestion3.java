// Question 3: Enter cost of 3 items from the user(using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.Scanner;

public class PracticeQuestion3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cost of a pencil: ");
        float pencilPrice = scanner.nextFloat();
        System.out.print("Cost of a pen: ");
        float penPrice = scanner.nextFloat();
        System.out.print("Cost of an eraser: ");
        float eraserPrice = scanner.nextFloat();

        float totalProductPrice = pencilPrice + penPrice + eraserPrice;
        float gst = 0.18f;
        float finalPrice = totalProductPrice + (totalProductPrice * gst);

        System.out.println("Total cost of the items: " + finalPrice);

        scanner.close();
    }
}

import java.util.*;

public class PassFailTernary {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        String reportCard = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(reportCard);

        scanner.close();
    }
}
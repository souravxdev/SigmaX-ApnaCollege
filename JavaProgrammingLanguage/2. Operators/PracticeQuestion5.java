/*
Question 5: What will be the output of the following program:

    public static void main(String args[]) {
        int x = 10, y = 5;

        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        
        System.out.println(exp1);
        System.out.println(exp2);
    }
*/

public class PracticeQuestion5 {
    public static void main(String args[]) {
        int x = 10, y = 5;

        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);

        System.out.println(exp1);
        System.out.println(exp2);
    }
}

// Answer: 20 20
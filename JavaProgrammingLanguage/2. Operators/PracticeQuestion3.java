/*
Question 3: What will be the output of the following program:

    public static void main(String args[]) {
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
*/

public class PracticeQuestion3 {

    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= x + y;
        System.out.println(x + " " + y + " " + z);
    }
}

// Answer: 4 0 0

public class CallByValue {

    public static void swap(int x, int y) {
        // swap: values exchange
        int temp = x;
        x = y;
        y = temp;

        System.out.println("a = " + x);
        System.out.println("b = " + y);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        swap(a, b); // Send a copy of a & b // Java always calls by value

        // Original a & b remains same in main function
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
    }
}

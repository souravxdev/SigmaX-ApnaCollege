public class FunctionOverloadingDataType {

    // function to calculate int sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate float sum of 3 numbers
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Function Overloading using type of parameter.
        System.out.println(sum(3, 5));
        System.out.println(sum(3.2f, 4.8f));
    }
}

public class FunctionOverloadingParameters {

    // Function Overloading: Multiple functions with the same name but different
    // parameters.
    // Differentiator: 1. Type of parameter, 2. Number of parameter; Not depend on
    // the return type

    // function to calculate sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Function Overloading using number of parameter.
        System.out.println(sum(3, 5));
        System.out.println(sum(5, 2, 4));
    }
}

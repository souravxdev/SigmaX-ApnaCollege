public class ProductOfAB {

    public static int multiply(int x, int y) {
        int product = x * y;
        return product;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int multiplication = multiply(a, b);
        System.out.println("Multiply: " + multiplication);
    }
}

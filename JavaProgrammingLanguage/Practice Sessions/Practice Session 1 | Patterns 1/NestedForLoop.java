public class NestedForLoop {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " " + j);
                // System.out.println(j);
            }
            System.out.println();
        }
    }
}

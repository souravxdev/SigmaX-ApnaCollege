public class ContinueOne {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip an iteration
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

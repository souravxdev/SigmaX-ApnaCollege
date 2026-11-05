public class Character {

    public static void main(String[] args) {
        int n = 5;
        char ch = 65;
        for (int row = 1; row <= n; row++) {
            for (int character = 1; character <= row; character++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

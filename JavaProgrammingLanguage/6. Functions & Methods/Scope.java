public class Scope {

    public static void main(String[] args) {
        // Scope

        // Method Scope
        // Variable declared in a function/method will be accesible withing the function
        // only after it's declaration, not before that.

        // System.out.println(s); // Can't use s variable before it's declaration.
        int s = 44;
        System.out.println(s);

        // Block Scope -> Curly braces
        // Variable defined in a curly braces is accessible within the curly braces
        // after it's declaration.
        {
            int a = 45;
            System.out.println(a);
        }
        // System.out.println(a); // // Can't use a variable outside of it' block.

        // Class Scope
        // Access Modifier -> public, private, protected
    }
}

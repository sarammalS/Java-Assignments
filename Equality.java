import java.util.Scanner;

public class Equality{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // XOR operation: result will be 0 if a == b
        int result = a ^ b;

        // Use ternary to check equality
        String output = (result == 0) ? "Numbers are equal." : "Numbers are not equal.";
        System.out.println(output);
    }
}

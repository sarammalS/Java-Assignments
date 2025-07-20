import java.util.Scanner;

public class FirstSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("No");
            return;
        }

        int pos= 1;
        while ((num & 1) == 0) {
            num = num >> 1;  
            pos+;
        }

        System.out.println("The first set bit is at position: " + position);
    }
}

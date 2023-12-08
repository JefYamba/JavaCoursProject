package week4;
import java.util.Scanner;

public class MisMatchExTest {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);

        try {
            int value = scanner.nextInt();
        } catch (Exception InputMismatchException) {
            System.out.println("The value must be an integer.");
        }
    }
}

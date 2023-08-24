import java.util.InputMismatchException;
import java.util.Scanner;

public class MinMaxMethods {
    public static void main(String[] args) {
        MinMaxMethods mmm = new MinMaxMethods();

        int num1, num2, num3;

        Scanner reader = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Please enter the first number: ");
                num1 = reader.nextInt();
                break;
            } catch (InputMismatchException e) {
                reader.nextLine();
                System.out.println("Please enter a number.");
            }
        }
        while (true) {
            try {
                System.out.print("Please enter the second number: ");
                num2 = reader.nextInt();
                break;
            } catch (InputMismatchException e) {
                reader.nextLine();
                System.out.println("Please enter a number.");
            }
        }
        while (true) {
            try {
                System.out.print("Please enter the third number: ");
                num3 = reader.nextInt();
                break;
            } catch (InputMismatchException e) {
                reader.nextLine();
                System.out.println("Please enter a number.");
            }
        }
        System.out.println("Entered numbers are " + num1 + ", " + num2 + " and " + num3);
        System.out.println("Minimum number = " + mmm.Minimum(num1, num2, num3));
        System.out.println("Maximum number = " + mmm.Maximum(num1, num2, num3));
    }

    public int Minimum(int num1, int num2, int num3) {
        int min;
        min = Math.min(num1, num2);
        min = Math.min(min, num3);
        return min;
    }
    public int Maximum(int num1, int num2, int num3) {
        int max;
        max = Math.max(num1, num2);
        max = Math.max(max, num3);
        return max;
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinMaxMethods {
    public static void main(String[] args) {
        // Creates a new object of this class to call the non-static methods
        MinMaxMethods mmm = new MinMaxMethods();

        // Creates three double variables to store the user numbers
        double num1, num2, num3;

        // Creates a scanner class to read the user inputs
        Scanner reader = new Scanner(System.in);

        // Collects the user's numbers, while making sure they are entering numbers
        while (true) {
            try {
                System.out.print("Please enter the first number: ");
                num1 = reader.nextDouble();
                break;
            } catch (InputMismatchException e) {
                reader.nextLine();
                System.out.println("Please enter a number.");
            }
        }
        while (true) {
            try {
                System.out.print("Please enter the second number: ");
                num2 = reader.nextDouble();
                break;
            } catch (InputMismatchException e) {
                reader.nextLine();
                System.out.println("Please enter a number.");
            }
        }
        while (true) {
            try {
                System.out.print("Please enter the third number: ");
                num3 = reader.nextDouble();
                break;
            } catch (InputMismatchException e) {
                reader.nextLine();
                System.out.println("Please enter a number.");
            }
        }

        // If any of the numbers have a remainder when divided by zero, they are a decimal
        // If any values are decimals, runs the double methods and prints the values as doubles
        // If all values are whole numbers, runs the integer methods and prints the values as integers
        if (num1 % 1 != 0 || num2 % 1 != 0 || num3 % 1 != 0) {
            System.out.println("Running double version");
            System.out.println("Entered numbers are " + num1 + ", " + num2 + " and " + num3);
            System.out.println("Minimum number = " + mmm.Minimum(num1, num2, num3));
            System.out.println("Maximum number = " + mmm.Maximum(num1, num2, num3));
        } else {
            System.out.println("Running integer version");
            System.out.println("Entered numbers are " + (int)num1 + ", " + (int)num2 + " and " + (int)num3);
            System.out.println("Minimum number = " + mmm.Minimum((int)num1, (int)num2, (int)num3));
            System.out.println("Maximum number = " + mmm.Maximum((int)num1, (int)num2, (int)num3));
        }

    }

    // Compares the first two numbers to find the minimum number
    // Then compares the minimum of those two numbers vs the third number
    // Returns the minimum of all the numbers
    public int Minimum(int num1, int num2, int num3) {
        int min;
        min = Math.min(num1, num2);
        min = Math.min(min, num3);
        return min;
    }
    // Double version of the method above
    public double Minimum(double num1, double num2, double num3) {
        double min;
        min = Math.min(num1, num2);
        min = Math.min(min, num3);
        return min;
    }

    // Compares the first two numbers to find the maximum number
    // Then compares the maximum of those two numbers vs the third number
    // Returns the maximum of all the numbers
    public int Maximum(int num1, int num2, int num3) {
        int max;
        max = Math.max(num1, num2);
        max = Math.max(max, num3);
        return max;
    }
    // Double version of the above method
    public double Maximum(double num1, double num2, double num3) {
        double max;
        max = Math.max(num1, num2);
        max = Math.max(max, num3);
        return max;
    }
}

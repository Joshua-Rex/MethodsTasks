import java.math.BigInteger;

public class FibonacciCalc {
    public static void main(String[] args) {
        // Main method which calls the Fibonacci method
        Fibonacci();
    }

    public static void Fibonacci() {
        // Creates 3 Big Integer variables for future use and assigns two of them values
        // The values assigned are the first two values of the Fibonacci sequence
        BigInteger X1 = BigInteger.valueOf(0), X2 = BigInteger.valueOf(1);
        BigInteger sum;

        // Creates a string variables for transferring values over
        String temp;

        // Prints the first two values of the Fibonacci sequence
        System.out.print(X1);
        System.out.print(", " + X2);

        // Loops for the remaining values of the Fibonacci sequence
        // The sum value becomes the sum of variables X1 and X2
        // The sum value then gets printed out
        // X1 gets assigned the value of X2 and X2 gets assigned the value of the sum
        // Garbage collector gets ran to remove the previous big integer values
        for (byte i = 0; i < 98; i++) {
            sum = X2.add(X1);
            System.out.print(", " + sum);
            temp = X2.toString();
            X1 = new BigInteger(temp);
            temp = sum.toString();
            X2 = new BigInteger(temp);
            System.gc();
        }
    }
}

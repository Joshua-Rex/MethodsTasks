import java.math.BigInteger;

public class FibonacciCalc {
    public static void main(String[] args) {
        Fibonacci();
    }

    public static void Fibonacci() {
        BigInteger X1 = BigInteger.valueOf(0), X2 = BigInteger.valueOf(1);
        BigInteger sum;
        String temp;

        System.out.print(X1);
        System.out.print(", " + X2);

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

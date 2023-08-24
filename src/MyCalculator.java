public class MyCalculator {
    public static void main(String[] args) {
        // Creates a new object of this class to call the non-static classes
        MyCalculator cal = new MyCalculator();

        // Creates two float variables as test numbers to use in the methods
        float num1 = 2.4537f;
        float num2 = 16.3976f;

        // Prints all the methods out to two decimal places
        System.out.println("Addition of both numbers = " + String.format("%.2f", cal.Addition(num1, num2)));
        System.out.println("Subtraction of both numbers = " + String.format("%.2f", cal.Subtraction(num1, num2)));
        System.out.println("Multiplication of both numbers = " + String.format("%.2f", cal.Multiplication(num1, num2)));
        System.out.println("Division of both numbers = " + String.format("%.2f", cal.Division(num1, num2)));
    }

    // Adds both numbers together and returns the outcome
    public float Addition(float num1, float num2) {
        return num1 + num2;
    }
    // Subtracts both numbers and return the outcome
    public float Subtraction(float num1, float num2) {
        return num1 - num2;
    }
    // Multiplies both numbers and returns the outcome
    public float Multiplication(float num1, float num2) {
        return num1 * num2;
    }
    // Divides both numbers and returns the outcome
    public float Division(float num1, float num2) {
        return num1 / num2;
    }
}

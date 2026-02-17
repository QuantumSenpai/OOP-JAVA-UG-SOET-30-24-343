import java.util.Scanner;
import java.util.InputMismatchException;

class Calculator {

    void divide(int a, int b) {

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int x = sc.nextInt();

            System.out.print("Enter second number: ");
            int y = sc.nextInt();

            c.divide(x, y);
        }

        catch (InputMismatchException e) {
            System.out.println("Please enter numbers only.");
        }
    }
}

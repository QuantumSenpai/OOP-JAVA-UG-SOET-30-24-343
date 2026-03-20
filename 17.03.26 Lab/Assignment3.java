import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter numbers one by one (enter 0 to stop):");

        try {
            while (true) {
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                if (num == 0) break;
                sum += num;
                count++;
            }

            if (count > 0) {
                double avg = (double) sum / count;
                System.out.println("Average = " + avg);
            } else {
                System.out.println("No numbers entered");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only");

        } finally {
            System.out.println("Scanner resource released");
            scanner.close();
        }
    }
}
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class ElectionBooth {
    public void checkEligibility(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Underage voters not allowed");
        }
        System.out.println("Age " + age + " -> Eligible to vote!");
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        ElectionBooth booth = new ElectionBooth();

        try {
            booth.checkEligibility(20);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            booth.checkEligibility(15);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
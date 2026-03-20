class DataProcessor {
    public int parseData(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        DataProcessor dp = new DataProcessor();

        try {
            int result = dp.parseData("42");
            System.out.println("Parsed value: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        try {
            int result = dp.parseData("ABC");
            System.out.println("Parsed value: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}
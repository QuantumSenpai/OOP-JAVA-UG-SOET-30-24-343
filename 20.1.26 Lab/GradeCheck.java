class Grade {
    public static void main(String[] args) {

        int marks = 100;   

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
            return;
        }

        switch (marks / 10) {
            case 10:  
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            case 5:
                System.out.println("Grade: E");
                break;
            default:
                System.out.println("Grade: F (Fail)");
        }
    }
}


/*OUTPUT:
 Grade: A
*/
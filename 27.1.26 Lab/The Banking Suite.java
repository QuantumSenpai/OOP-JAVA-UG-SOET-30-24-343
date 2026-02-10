class Bank {
    double getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 5;
    }
}

class ICICI extends Bank {
    double getInterestRate() {
        return 7;
    }
}

class Main {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getInterestRate() + "%");

        b = new ICICI();
        System.out.println("ICICI Interest Rate: " + b.getInterestRate() + "%");
    }
}

/*
Output:
SBI Interest Rate: 5.0%
ICICI Interest Rate: 7.0%
*/

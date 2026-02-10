class BankVault {

    private static double totalVaultBalance = 0;

    static void deposit(double amount) {
        totalVaultBalance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Total Balance: " + totalVaultBalance);
    }
}

class Main {
    public static void main(String[] args) {

        BankVault user1 = new BankVault();
        BankVault user2 = new BankVault();
        BankVault user3 = new BankVault();

        BankVault.deposit(1000);
        BankVault.deposit(2000);
        BankVault.deposit(1500);
    }
}

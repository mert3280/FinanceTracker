package financetracker.models;

public class Savings extends Accounts {

    private final double interestRate;

    public Savings(String accountName, int accountNumber, double balance, double interestRate) {
        super(accountName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInterest Rate: " + interestRate;
    }
    
}

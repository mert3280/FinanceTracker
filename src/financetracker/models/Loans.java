package financetracker.models;

public class Loans extends Accounts {

    private final double interestRate;
    private final double loanAmount;

    public Loans(String accountName, int accountNumber, double balance, double interestRate, double loanAmount) {
        super(accountName, accountNumber, balance);
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInterest Rate: " + interestRate + "\nLoan Amount: " + loanAmount;
    }
    
}

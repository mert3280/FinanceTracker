package financetracker.models;

public class Checking extends Accounts {

    private final double overdraftFee;
    private final double overdraftAmount;

    public Checking(String accountName, int accountNumber, double balance, double overdraftFee, double overdraftAmount) {
        super(accountName, accountNumber, balance);
        this.overdraftFee = overdraftFee;
        this.overdraftAmount = overdraftAmount;
    }

    @Override
    public String toString() {
        if (overdraftAmount > 0) {
            return super.toString() + 
            "\nOverdraft Fee: " + overdraftFee + 
            "\nOverdraft Amount: " + overdraftAmount;
        }else {
            return super.toString();
        }
    }

    
    
}

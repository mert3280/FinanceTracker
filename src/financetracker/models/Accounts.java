package financetracker.models;

public class Accounts {

    private double balance;
    private int accountNumber;
    private String accountName;


    public Accounts(String accountName, int accountNumber, double balance ) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return 
        "Account Name: " + accountName + 
        "\nAccount Number: " + accountNumber + 
        "\nBalance: " + balance;
    }

    

}

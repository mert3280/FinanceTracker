package financetracker.models;

public class Transactions {
    private String name;
    private String date;
    private double amount;

    public Transactions(String name, String date, double amount) {
        this.name = name;
        this.date = date;
        this.amount = amount;
    }

    public String toString(){
        return "Name: " + name + ", Date: " + date + ", Amount: $" + amount;
    }
}

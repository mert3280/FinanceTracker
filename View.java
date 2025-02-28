package financetracker.views;

import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to Finance Tracker!");
    }

    public void clearScreen() {
    }

    public String addTransactionName() {
        System.out.println("Set transaction name: ");
        return sc.nextLine().trim();
    }
    public String addTransactionDate() {
        System.out.println("Set transaction date: ");
        return sc.nextLine().trim();
    }
    public Double addTransactionAmount() {
        boolean go = true;
        System.out.println("Set transaction amount($): ");
        while (go) {
            try{
                return Double.parseDouble(sc.nextLine());
            }catch(Exception e){
                System.out.println("Invalid input, please enter a double: ");
            }
        }
        return 0.0;
    }

    public boolean viewTransactions(){
        boolean go = true;
        System.out.println("Would you like to view your transactions?(Y/N): ");
        while (go) {
            if(sc.nextLine().equalsIgnoreCase("Y")) {
                return true;
            }else if(sc.nextLine().equalsIgnoreCase("N")) {
                return false;
            }
        }
        return false;
    }
    
}

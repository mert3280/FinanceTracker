package financetracker.views;

import java.util.Scanner;

public class View {
    Scanner scan = new Scanner(System.in);


    public void start() {
        System.out.println("Welcome to Finance Tracker!");
    }

    public String printMenu() {
        System.out.println("1. Add an expense");
        System.out.println("2. Add an income");
        System.out.println("3. View all transactions");
        System.out.println("4. View balance");
        System.out.println("5. Exit");
        return scan.nextLine();
    }

    public String getExpenseDetails() {
        clearScreen();
        System.out.println("Enter the amount of the expense: ");
        return scan.nextLine();
    }

    public String getIncomeDetails() {
        clearScreen();
        System.out.println("Enter the amount of the income: ");
        return scan.nextLine();
    }

    public void printTransactions(String transactions) {
        clearScreen();
        System.out.println(transactions);
    }

    public void printBalance(String balance) {
        clearScreen();
        System.out.println("Your current balance is: " + balance);
    }

    public void printExit() {
        System.out.println("Goodbye!");
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }






    
}

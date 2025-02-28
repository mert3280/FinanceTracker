package financetracker.controller;

import financetracker.views.View;

import java.util.ArrayList;

import financetracker.models.Transactions;

public class Controller {
    private View view = new View();
    ArrayList<Transactions> transactions = new ArrayList<>();

    public void run(){
        view.clearScreen();
        view.start();

        transactions.add(new Transactions(view.addTransactionName(), view.addTransactionDate(), view.addTransactionAmount()));
        if(view.viewTransactions()){
            for(Transactions transaction : transactions){
                System.out.println(transaction.toString());
            }
        }

    }    
}

package financetracker.controller;

import financetracker.views.View;

public class Controller {
    private View view = new View();

    public void run(){
        view.clearScreen();
        view.start();
        String input = view.printMenu();
        while(!input.equals("5")){
            switch(input){
                case "1":
                    view.getExpenseDetails();
                    break;
                case "2":
                    view.getIncomeDetails();
                    break;
                case "3":
                    view.printTransactions("transactions");
                    break;
                case "4":
                    view.printBalance("balance");
                    break;
                default:
                    break;
            }
        }
        view.clearScreen();
        view.printExit();
    }    
}

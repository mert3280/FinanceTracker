package financeTracker.controller;

import financeTracker.views.View;

public class Controller {
    private View view = new View();

    public void run(){
        view.clearScreen();
        view.start();
    }    
}

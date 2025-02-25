package financetracker.views;

public class View {


    public void start() {
        System.out.println("Welcome to Finance Tracker!");
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}

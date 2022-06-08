package logica;

import grafica.MainScreen;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MainScreen tPrincipal = new MainScreen();
        tPrincipal.setVisible(true);
        tPrincipal.gameDisplay(1);
        Thread.sleep(5000);
        tPrincipal.gameDisplay(2);
    }
}
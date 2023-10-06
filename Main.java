package Ateliers;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) 
    {
        Ateliers.gui.MainWindow mainWindow = new Ateliers.gui.MainWindow();
        mainWindow.setExtendedState(mainWindow.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        mainWindow.setVisible(true);
    }
}

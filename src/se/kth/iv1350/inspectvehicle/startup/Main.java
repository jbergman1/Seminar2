
package se.kth.iv1350.inspectvehicle.startup;

import se.kth.iv1350.inspectvehicle.controller.Controller;
import se.kth.iv1350.inspectvehicle.integration.DatabaseManager;
import se.kth.iv1350.inspectvehicle.view.View;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**
     * This is the application's main method, which starts the entire car inspection system.
     * 
     * @param args The are no command line parameters.
     */
        DatabaseManager dbMgr = new DatabaseManager();
        Controller contr = new Controller(dbMgr);
        View view = new View(contr);
        view.sampleExecution();
    
    }
    
}

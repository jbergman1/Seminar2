
package se.kth.iv1350.inspectvehicle.view;

import se.kth.iv1350.inspectvehicle.controller.Controller;
import se.kth.iv1350.inspectvehicle.model.CreditCard;
import java.util.Date;

public class View {
    private  Controller contr;
    
    /**
     * Creates a new instance that will use the specified controller for all system operations.
     * 
     * @param contr The controller to use for system operations.
     */
    public View(Controller contr) {
        this.contr = contr;
    }
    
    /**
     * Calls all system operations and prints the result to <code>System.out</code>.
     */
    public void sampleExecution() {
        contr.newInspection();
        contr.closeDoor();
        String regNoOfVehicleToInspect = "ABC123";
        int cost = contr.enterRegNo(regNoOfVehicleToInspect);
        System.out.println("The cost is: " + cost);
        Date expiryDate = new Date(2020,12,18);
        CreditCard creditCard = new CreditCard(1234, "1111 2222 3333 4444", "Nilas", expiryDate, 420);
        contr.enterPaymentInfo(creditCard, cost);
        contr.startInspection();
        
    }
}

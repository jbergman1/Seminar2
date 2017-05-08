
package se.kth.iv1350.inspectvehicle.controller;

import se.kth.iv1350.inspectvehicle.integration.DatabaseManager;
import se.kth.iv1350.inspectvehicle.integration.Garage;
import se.kth.iv1350.inspectvehicle.model.Inspection;
import se.kth.iv1350.inspectvehicle.model.Vehicle;
import se.kth.iv1350.inspectvehicle.model.CreditCard;
import se.kth.iv1350.inspectvehicle.model.Transaction;
import se.kth.iv1350.inspectvehicle.integration.Printer;
import se.kth.iv1350.inspectvehicle.model.InspectionLoop;

public class Controller {
    private DatabaseManager dbMgr;
    private Garage garage;
    private Transaction transaction;
    private Printer printer;
    private InspectionLoop inspectionLoop;

    /**
      * Creates a new instance using the specified database manager.
      *
      * @param dbMgr The database manager used for all database calls.
      */
     public Controller(DatabaseManager dbMgr) {
         this.dbMgr = dbMgr;
         this.garage = new Garage();
         this.inspectionLoop = new InspectionLoop(dbMgr);
         this.printer = new Printer();
     }

     /*
     * Lets the program know a new inspection can begin
     */
    public void newInspection(){
        garage.nextCustomer();
    }
    /**
     * Closes the garage door.
     */
    public void closeDoor(){
        garage.closeDoor();
    }
    /**
      * Verifies that there are inspections to perform for the vehicle with the specified
      * registration number. If there are inspections, returns the total cost for the inspections.
      * Returns null if there are no inspections to perform.
      *
      * @param regNo The registration number of the vehicle to inspect.
      * @return The total cost for the inspections, or null if there are no inspections to perform.
      */
     public int enterRegNo(String regNo) {
         Vehicle vehicle = new Vehicle(regNo);
         Inspection inspection = new Inspection(vehicle, dbMgr);
         return inspection.getCost();
     }
    /**
     * Customer enters credit card information and program sends it to external authorization system.
     * Then prints receipt.
     */
     public void enterPaymentInfo(CreditCard creditCard, int cost){
             this.transaction = new Transaction(creditCard, cost, printer);
             transaction.enterPayInfo();
     }
     /*
     * Initiates the actual inspections of the different parts and prints the results.
     */
     public void startInspection(){
         this.inspectionLoop = new InspectionLoop(dbMgr);
         inspectionLoop.printResults();
     }
}

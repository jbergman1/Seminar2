
package se.kth.iv1350.inspectvehicle.model;

import se.kth.iv1350.inspectvehicle.integration.DatabaseManager;
import se.kth.iv1350.inspectvehicle.integration.Printer;


public class InspectionLoop {

    String[] inspectThis; 
    String[] inspectionResults;
    private Printer printer;
    private PrintOut printOut;
    /*
    * This method performs the inspections and grades them with pass/fail
    * This dummy implementation always responds with pass.
    */
    public InspectionLoop(DatabaseManager dbMgr){
    int i = 0;
    inspectThis = DatabaseManager.getItemsToInspect();
    while (i < inspectThis.length)
        inspectionResults[i] = inspectThis[i] + " passed.";
    }
    /*
    * Prints the results of the inspections
    */
    public void printResults(){
        printOut = new PrintOut(inspectionResults);
        printer.printPrintOut(printOut);
    }    
}


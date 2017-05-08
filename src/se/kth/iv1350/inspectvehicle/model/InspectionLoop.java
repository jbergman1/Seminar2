
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
    inspectionResults = new String[inspectThis.length];
    while (i < inspectThis.length){
        inspectionResults[i] = inspectThis[i] + " passed.";
        i++;
        }
    }
    /*
    * Prints the results of the inspections
    */
    public void printResults(){
        printer = new Printer();
        printOut = new PrintOut(inspectionResults);
        printer.printPrintOut(printOut);
    }    
}


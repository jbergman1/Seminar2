
package se.kth.iv1350.inspectvehicle.model;

/**
 * This class represents the prinout of the results from the inspection.
 */
public class PrintOut {
    private final String inspectionResult[];
    
   /**
    * A constructor for the printout
    * @param inspectionResult the results from all the inspections
    */
    public PrintOut(String[] inspectionResult){
        this.inspectionResult = inspectionResult;
    }
}

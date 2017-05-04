
package se.kth.iv1350.inspectvehicle.integration;

import se.kth.iv1350.inspectvehicle.model.Receipt;
import se.kth.iv1350.inspectvehicle.model.PrintOut;

   /**
    * This class is a facade to the hardware of the printer
    */
    public class Printer {
    private Receipt receipt;
    private PrintOut printOut;

    public void printReceipt(Receipt receipt){
    this.receipt = receipt;
    System.out.println("Receipt printed");
    }

    public void printPrintOut(PrintOut printOut){
    this.printOut = printOut;
    System.out.println("Inspection results printed");
    }
}


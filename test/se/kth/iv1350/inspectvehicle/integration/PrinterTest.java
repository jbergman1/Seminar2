
package se.kth.iv1350.inspectvehicle.integration;

import org.junit.Test;
import se.kth.iv1350.inspectvehicle.model.InspectionLoop;
import se.kth.iv1350.inspectvehicle.model.PrintOut;
import se.kth.iv1350.inspectvehicle.model.Receipt;
/**
* If the methods can be run without exception, the test passes
*/
public class PrinterTest {


    public PrinterTest() {
    }

    /**
    * Test of printReceipt method, of class Printer.
    */
    @Test
    public void testPrintReceipt() {
    int test = 4;
    System.out.println("printReceipt");
    Receipt receipt = new Receipt(test);
    Printer instance = new Printer();
    instance.printReceipt(receipt);
    }
    /**
    * Test of printPrintOut method, of class Printer.
    */
    @Test
    public void testPrintPrintOut() {
    String[] inspectionResult = DatabaseManager.getItemsToInspect();
    System.out.println("printPrintOut");
    PrintOut printOut = new PrintOut(inspectionResult);
    Printer instance = new Printer();
    instance.printPrintOut(printOut);
 }

}
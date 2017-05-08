
package se.kth.iv1350.inspectvehicle.model;

import se.kth.iv1350.inspectvehicle.integration.Printer;
import se.kth.iv1350.inspectvehicle.integration.PaymentAuthorizationSystem;

public class Transaction {
    private final CreditCard customerCard;
    private final int inspectionCost;
    private final Printer printer;
    private Receipt receipt;
    private PaymentAuthorizationSystem paymentAuthorizationSystem;
    
   /**
    * A constuctor for the Transaction.
    * @param customerCard customer credit card information.
    * @param inspectionCost cost for the inspection.
    * @param printer
    */
    public Transaction(CreditCard customerCard, int inspectionCost, Printer printer){
    this.customerCard = customerCard;
    this.inspectionCost = inspectionCost;
    this.printer = printer;
    this.paymentAuthorizationSystem = new PaymentAuthorizationSystem();
    }
    
   /**
    * Program prints receipt
    */
    public void enterPayInfo(){
    if (paymentAuthorizationSystem.authorizePayment(customerCard, inspectionCost) == true){
        System.out.println("Payment authorization OK");
        receipt = new Receipt(inspectionCost);
        printer.printReceipt(receipt);
        }  
    }
}

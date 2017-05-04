
package se.kth.iv1350.inspectvehicle.integration;

import se.kth.iv1350.inspectvehicle.model.CreditCard;

public class PaymentAuthorizationSystem {
   /**
    * Requests authorization for payment
    *
    * @param card Card used for payment
    * @param amount Amount to pay
    * @return true if payment is authorized, otherwise false. 
    * This dummy always returns true
    */
    public boolean authorizePayment(CreditCard card, int amount) {
    return true;
    }
}

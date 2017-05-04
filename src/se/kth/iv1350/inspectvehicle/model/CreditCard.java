
package se.kth.iv1350.inspectvehicle.model;

import java.util.Date;

public final class CreditCard {
    private final int pin;
    private final String cardNumber;
    private final String cardHolder;
    private final Date expiryDate;
    private final int CVC;
  /**
    * Creates a new instance for the specific card
    *
    * @param pin The pin code
    * @param cardNumber The card number
    * @param cardHolder The name of the card holder
    * @param expiryDate The expiry date
    * @param CVC The CVC code
    */
    public CreditCard(int pin, String cardNumber, String cardHolder, Date expiryDate, int CVC)
    {
        this.pin = pin;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
        this.CVC = CVC;
    }
   /**
    * @return the CVC code
    */
    public int getCVC() {
    return CVC;
    }
    
   /**
    * @return the expiry date
    */
    public Date getExpiryDate() {
    return expiryDate;
    }
    
   /**
    * @return the card holder's name.
    */
    public String getCardHolder() {
    return cardHolder;
    }
    
   /**
    * @return the card number
    */
    public String getCardNumber() {
    return cardNumber;
    }
    
   /**
    * @return the pin code.
    */
    public int getPin() {
    return pin;
    }

}

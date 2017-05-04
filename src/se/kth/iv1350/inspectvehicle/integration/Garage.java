
package se.kth.iv1350.inspectvehicle.integration;


public class Garage {
    private int displayQueueNumber = 0;
    boolean doorClosed = true;
    /**
     * Updates the display with the next queue number and opens the door
     */
    public void nextCustomer(){
        displayQueueNumber++;
        System.out.println(displayQueueNumber);
        openDoor();
    }
    
    private void openDoor(){
        doorClosed = false;
    }
    
    public void closeDoor(){
        doorClosed = true;
    }
}

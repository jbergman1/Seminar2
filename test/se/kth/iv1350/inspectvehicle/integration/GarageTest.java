/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.inspectvehicle.integration;

import org.junit.Test;

/**
* If the methods are run without exception, the test is passed.
*/
public class GarageTest {

 Garage instance = new Garage();
 /**
 * Test of nextCustomer method, of class Garage.
 */
 @Test
 public void testNextCustomer() {
 instance.nextCustomer();
 }
 /**
 * Test of closeDoor method, of class Garage.
 */
 @Test
 public void testCloseDoor() {
 instance.closeDoor();
 }

}
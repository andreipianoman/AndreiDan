/*
 * Testinf class Car
 */
package autoservice;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Turbotwins
 */
public class CarTest {
    
    public CarTest() {
    }

    /**
     * Test of getName method, of class Car.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Car instance = new Car();
        String expResult = "Default car name";
        String result = instance.getName();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Car.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Car instance = new Car();
        instance.setColor(Car.Color.BLUE);
        Car.Color expResult = Car.Color.BLUE;
        Car.Color result = instance.getColor();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class Car.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Car instance = new Car();
        short expResult = 90;
        short result = instance.getSpeed();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Car.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "New";
        String expName = "New";
        Car instance = new Car();
        instance.setName(newName);
        assertEquals(expName, instance.getName());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Car.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Car.Color newColor = Car.Color.BLUE;
        Car.Color expColor = Car.Color.BLUE;
        Car instance = new Car();
        instance.setColor(newColor);
        assertEquals(instance.getColor(), expColor);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class Car.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        short newSpeed = 225;
        short expSpeed = 225;
        Car instance = new Car();
        instance.setSpeed(newSpeed);
        assertEquals(expSpeed, instance.getSpeed());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setRentPrice method, of class Car.
     */
    @Test
    public void testSetRentPrice() {
        System.out.println("setRentPrice");
        int newRentPrice = 25;
        // int expRentPrice = 25;
        Car instance = new Car();
        instance.setRentPrice(newRentPrice);
        assertEquals(newRentPrice, instance.getDailyRentPrice());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setSalePrice method, of class Car.
     */
    @Test
    public void testSetSalePrice() {
        System.out.println("setSalePrice");
        int newSalePrice = 1000;
        int expSalePrice = 1000;
        Car instance = new Car();
        instance.setSalePrice(newSalePrice);
        assertEquals(expSalePrice, instance.getSalePrice());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of increaseSpeed method, of class Car.
     */
    @Test
    public void testIncreaseSpeed() {
        System.out.println("increaseSpeed");
        short newSpeed = 150;
        short expSpeed = 150;
        short newSpeed1 = 75;
        short expSpeed1 = 75;
        Car instance = new Car();
        instance.increaseSpeed(newSpeed);
        assertEquals(expSpeed, instance.getSpeed());
        instance.increaseSpeed(newSpeed1);
        assertEquals(expSpeed1, instance.getSpeed());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of decreaseSpeed method, of class Car.
     */
    @Test
    public void testDecreaseSpeed() {
        System.out.println("decreaseSpeed");
        short newSpeed = 60;
        short expSpeed = 60;
        short newSpeed1 = 190;
        short expSpeed1 = 190;
        Car instance = new Car();
        instance.decreaseSpeed(newSpeed);
        assertEquals(expSpeed, instance.getSpeed());
        instance.decreaseSpeed(newSpeed1);
        assertEquals(expSpeed1, instance.getSpeed());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getSalePrice method, of class Car.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getSalePrice();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getDailyRentPrice method, of class Car.
     */
    @Test
    public void testGetDailyRentPrice() {
        System.out.println("getDailyRentPrice");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getDailyRentPrice();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }
    
}

/*
 * Tests for class ALU
 */
package oopcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Turbotwins
 */
public class ALUTest {
    
    public ALUTest() {
    }

    /**
     * Test of getOperator method, of class ALU.
     */
    @Test
    public void testGetOperator() {
        System.out.println("getOperator");
        ALU instance = new ALU();
        Character expResult = null;
        Character result = instance.getOperator();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setOperator method, of class ALU.
     */
    @Test
    public void testSetOperator() {
        System.out.println("setOperator");
        Character operator = '+';
        ALU instance = new ALU();
        instance.setOperator(operator);
        assertEquals(operator, instance.getOperator());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getOperandUnu method, of class ALU.
     */
    @Test
    public void testGetOperandUnu() {
        System.out.println("getOperandUnu");
        ALU instance = new ALU();
        Integer expResult = null;
        Integer result = instance.getOperandUnu();
        assertEquals(expResult, result);
        expResult = 2;
        instance.setOperandUnu(2);
        result = instance.getOperandUnu();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setOperandUnu method, of class ALU.
     */
    @Test
    public void testSetOperandUnu() {
        System.out.println("setOperandUnu");
        Integer operandUnu = 12;
        ALU instance = new ALU();
        instance.setOperandUnu(operandUnu);
        assertEquals(operandUnu, instance.getOperandUnu());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getOperandDoi method, of class ALU.
     */
    @Test
    public void testGetOperandDoi() {
        System.out.println("getOperandDoi");
        ALU instance = new ALU();
        Integer expResult = null;
        Integer result = instance.getOperandDoi();
        assertEquals(expResult, result);
        expResult = 2;
        instance.setOperandDoi(2);
        assertEquals(expResult, instance.getOperandDoi());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setOperandDoi method, of class ALU.
     */
    @Test
    public void testSetOperandDoi() {
        System.out.println("setOperandDoi");
        Integer operandDoi = 12;
        ALU instance = new ALU();
        instance.setOperandDoi(operandDoi);
        assertEquals(operandDoi, instance.getOperandDoi());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getRezultat method, of class ALU.
     */
    @Test
    public void testGetRezultat() {
        System.out.println("getRezultat");
        ALU instance = new ALU();
        Integer expResult = null;
        Integer result = instance.getRezultat();
        assertEquals(expResult, result);
        expResult = 10;
        instance.setRezultat(10);
        result = instance.getRezultat();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setRezultat method, of class ALU.
     */
    @Test
    public void testSetRezultat() {
        System.out.println("setRezultat");
        Integer rezultat = 12;
        ALU instance = new ALU();
        instance.setRezultat(rezultat);
        assertEquals(rezultat, instance.getRezultat());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of calculeaza method, of class ALU.
     */
    @Test
    public void testCalculeaza() {
        System.out.println("calculeaza");
        ALU instance = new ALU();
        instance.setOperator('+');
        instance.setOperandUnu(2);
        instance.setOperandDoi(3);
        instance.calculeaza();
        Integer expResult = 5;
        assertEquals(expResult, instance.getRezultat());
        instance.setOperator('-');
        instance.calculeaza();
        expResult = -1;
        assertEquals(expResult, instance.getRezultat());
        instance.setOperator('*');
        instance.calculeaza();
        expResult = 6;
        assertEquals(expResult, instance.getRezultat());
        instance.setOperator('/');
        instance.calculeaza();
        expResult = 0;
        assertEquals(expResult, instance.getRezultat());
        // fail("The test case is a prototype.");
    }
    
}

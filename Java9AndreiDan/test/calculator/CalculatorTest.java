/*
 * Tests for Calculator class.
 */
package calculator;

import Calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Turbotwins
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    /**
     * Test of aduna method, of class Calculator.
     */
    @Test
    public void testAduna() {
        System.out.println("aduna");
        int a = 1;
        int b = 1;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.aduna(a, b);
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of scade method, of class Calculator.
     */
    @Test
    public void testScade() {
        System.out.println("scade");
        int a = 5;
        int b = 3;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.scade(a, b);
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of inmulteste method, of class Calculator.
     */
    @Test
    public void testInmulteste() {
        System.out.println("inmulteste");
        int a = 3;
        int b = 4;
        Calculator instance = new Calculator();
        int expResult = 12;
        int result = instance.inmulteste(a, b);
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of imparte method, of class Calculator.
     */
    @Test
    public void testImparte() {
        System.out.println("imparte");
        int a = 10;
        int b = 5;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.imparte(a, b);
        assertEquals(expResult, result);
        boolean thrown = false;
        a = 6;
        b = 0;
        try {
            instance.imparte(a, b);
        } catch(ArithmeticException e) {
            thrown = true;
        }
        assertTrue(thrown);
        // fail("The test case is a prototype.");
    }
    
}

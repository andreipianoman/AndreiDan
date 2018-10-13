/*
 * Testare Calculator
 */
package oopcomputer;

import java.util.Scanner;

/**
 *
 * @author Turbotwins
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creaza un calculator
        Carcasa calculator = new Carcasa();
        //Apasam butoane pana apare un operator
        calculator.buton1.apasa();
        calculator.buton2.apasa();
        calculator.buton3.apasa();
        calculator.butonPlus.apasa();
        calculator.buton3.apasa();
        calculator.buton2.apasa();
        calculator.buton1.apasa();
        calculator.butonEgal.apasa();
        //Apasam butoane pana apare =
        //Afisam rezultatul
    }
    
}

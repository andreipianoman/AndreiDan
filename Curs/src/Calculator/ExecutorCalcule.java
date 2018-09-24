/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.util.Scanner;

/**
 *
 * @author Turbotwins
 */
public class ExecutorCalcule {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator unCalculator = new Calculator();
        
        System.out.println("Introduceti primul numar:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        System.out.println("Introduceti al doilea numar:");
        Scanner sc1 = new Scanner(System.in);
        int j = sc1.nextInt();
        
        int iesireAdunare = unCalculator.aduna(i, j);
        System.out.println(iesireAdunare);
        
        int iesireScadere = unCalculator.scade(i, j);
        System.out.println(iesireScadere);
    }
    
    
}

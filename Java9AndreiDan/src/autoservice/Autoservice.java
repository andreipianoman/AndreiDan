/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

import autoservice.Car.Color;

/**
 *
 * @author Turbotwins
 */
public class Autoservice {

    /**
     * @param car
     * @param args the command line arguments
     */
    private static void displayAutoservice(Car car1, Car car2, Car car3) {
            System.out.println("Car name: " + car1.getName());
            System.out.println("Car speed: " + car1.getSpeed());
            System.out.println("Car color: " + car1.getColor());
            System.out.println("CarRentingPrice: " + car1.getDailyRentPrice());
            System.out.println("CarSalePrice: " + car1.getSalePrice());
            
            System.out.println("Car name: " + car2.getName());
            System.out.println("Car speed: " + car2.getSpeed());
            System.out.println("Car color: " + car2.getColor());
            System.out.println("CarRentingPrice: " + car2.getDailyRentPrice());
            System.out.println("CarSalePrice: " + car2.getSalePrice());
            
            System.out.println("Car name: " + car3.getName());
            System.out.println("Car speed: " + car3.getSpeed());
            System.out.println("Car color: " + car3.getColor());
            System.out.println("CarRentingPrice: " + car3.getDailyRentPrice());
            System.out.println("CarSalePrice: " + car3.getSalePrice());
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car kel = new Car("VW Golf 7", (short) 180, Color.BLUE, 80, 20000);
        Car golf = new Car("VW Gofl 6", (short) 179, Color.RED, 75, 19500);
        Car jeni = new Car("Ford Focus", (short) 191, Color.RED, 65, 18000);
        
        displayAutoservice(kel, golf, jeni);
        
        kel.increaseSpeed((short) (kel.getSpeed() + 10));
        golf.increaseSpeed((short) (golf.getSpeed() - 10));
        jeni.setRentPrice(jeni.getDailyRentPrice() + 15);
        jeni.setSalePrice(jeni.getSalePrice() - 1200);
        
        displayAutoservice(kel, golf, jeni);
    }
    
}

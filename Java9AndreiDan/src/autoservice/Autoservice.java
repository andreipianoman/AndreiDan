/*
 * Java Autoservice
 */
package autoservice;

import autoservice.Car.Color;

/**
 *
 * @author Turbotwins
 */
public class Autoservice {
    static Car kel, golf, jeni;
    /**
     * @param car
     * @param args the command line arguments
     */
    private static void displayAutoservice() {
            System.out.println("---------------Autoservice-----------------");
            System.out.println("First Car");
            System.out.println("Car name: " + kel.getName());
            System.out.println("Car speed: " + kel.getSpeed());
            System.out.println("Car color: " + kel.getColor());
            System.out.println("CarRentingPrice: " + kel.getDailyRentPrice());
            System.out.println("CarSalePrice: " + kel.getSalePrice());
            
            System.out.println("Second Car");
            System.out.println("Car name: " + golf.getName());
            System.out.println("Car speed: " + golf.getSpeed());
            System.out.println("Car color: " + golf.getColor());
            System.out.println("CarRentingPrice: " + golf.getDailyRentPrice());
            System.out.println("CarSalePrice: " + golf.getSalePrice());
            
            System.out.println("Third Car");
            System.out.println("Car name: " + jeni.getName());
            System.out.println("Car speed: " + jeni.getSpeed());
            System.out.println("Car color: " + jeni.getColor());
            System.out.println("CarRentingPrice: " + jeni.getDailyRentPrice());
            System.out.println("CarSalePrice: " + jeni.getSalePrice());
        }
    
    public static void main(String[] args) {
        
        kel = new Car("VW Golf 7", (short) 180, Color.BLUE);
        golf = new Car("VW Gofl 6", (short) 179, Color.RED);
        jeni = new Car("Ford Focus", (short) 191, Color.RED);
        kel.setSalePrice(20000);
        golf.setSalePrice(195000);
        jeni.setSalePrice(18000);
        kel.setRentPrice(75);
        golf.setRentPrice(70);
        jeni.setRentPrice(60);
        
        displayAutoservice();
        
        kel.increaseSpeed((short) (kel.getSpeed() + 10));
        golf.increaseSpeed((short) (golf.getSpeed() - 10));
        jeni.setRentPrice(jeni.getDailyRentPrice() + 15);
        jeni.setSalePrice(jeni.getSalePrice() - 1200);
        
        displayAutoservice();
    }
    
}

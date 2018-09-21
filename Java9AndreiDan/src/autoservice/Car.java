/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

/**
 *
 * @author Turbotwins
 */
public class Car implements Saleable, Rentable{
    
    public enum Color {WHITE, GREY, BLACK, RED, YELLOW, GREEN, BLUE}
    
    private Color color;
    private String name;
    private short speed;
    private int rentPrice;
    private int salePrice;
    
    public Car(){
        name = "Default car name";
        speed = 90;
    } 
    public Car(String carName, short carSpeed, Color carColor, int carRentPrice, int carSalePrice) {
        name = carName;
        speed = carSpeed;
        color = carColor;
        rentPrice = carRentPrice;
        salePrice = carSalePrice;
    }
    
    public String getName() {
        return(name);
    }
    
    public Color getColor() {
        return(color);
    }
    
    public short getSpeed() {
        return(speed);
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public void setColor(Color newColor) {
        color = newColor;
    }
    
    public void setSpeed(short newSpeed) {
        speed = newSpeed;
    }
    
    public void setRentPrice(int newRentPrice) {
        rentPrice = newRentPrice;
    }
    
    public void setSalePrice(int newSalePrice) {
        salePrice = newSalePrice;
    }
    
    public void increaseSpeed(short newSpeed) {
        if(newSpeed > speed) {
            speed = newSpeed;
        }
        else if(newSpeed < speed) {
            decreaseSpeed(newSpeed);
        }
    }

    public void decreaseSpeed(short newSpeed) {
        if(newSpeed < speed) {
            speed = newSpeed;
        }
        else if(newSpeed > speed) {
            increaseSpeed(newSpeed);
        }
    }

    @Override
    public int getSalePrice(){
        return(salePrice);
    }

    @Override
    public int getDailyRentPrice(){
        return(rentPrice);
    }    
}
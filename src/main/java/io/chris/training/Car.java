package io.chris.training;
import java.lang.Object.*;
public class Car extends Vehicle{

    protected float miles;
    protected double years;
    protected String maker;
    protected double price;
    protected double turbo;
    protected int mPH;


    public Car(float ml,double years,String maker,double price, double turbo, int mPH){
        this.miles = ml;
        this.years = years;
        this.maker = maker;
        this.price = price;
        this.turbo = turbo;
        this.mPH = mPH;
    }

    public String toString(){
        return "This is a " + years + "years old car with " + miles + " miles made by " + maker +", and the price for this car is: " + price + "dollars.";
    }

    public boolean withALicensePlate(){
        return getLicensePlateNum() != null;
    }

    public String onwerType() {
        if (miles >= 0 && years >= 0) {
            if ((miles / years) > 12000) {
                return "Business";
            } else {
                return "Family";
            }
        } else {
            return "This car not even exist!";
        }

    }






    public static void main(String args[]){
        Car car1 = new Car(12000,4, "Toyota",20000,2.0, 50);
        System.out.println(car1.needLicensePlate());
        System.out.println(car1.getLicensePlateNum());
        System.out.println(car1.onwerType());
        System.out.println(car1.toString());

    }
}

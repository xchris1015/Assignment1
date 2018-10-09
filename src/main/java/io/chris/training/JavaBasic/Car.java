package io.chris.training.JavaBasic;
public class Car implements Vehicle,Ship{

    protected float miles;
    protected double years;
    protected String maker;
    protected double price;
    protected double turbo;
    protected int mPH;

    @Override
    public void move() {
        System.out.println("This car can move");
    }

    @Override
    public void checkFloat() {
        System.out.println("This is not a ship.");
    }

    public Car(float ml, double years, String maker, double price, double turbo, int mPH){
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

    public static void main(String args[]){


    }
}

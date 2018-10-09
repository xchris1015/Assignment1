package io.chris.training.JavaBasic;
public class Motorcycle{
    protected int pedalNum;
    protected boolean gasTank;
    protected boolean motor;

    public Motorcycle(boolean gasTank, int pedalNum, boolean moter){
        this.gasTank=gasTank;
        this.pedalNum=pedalNum;
        this.motor =moter;
    }

    public boolean getGasTank(){
        return gasTank;
    }

    public Integer getPedalNum(){
        return pedalNum;
    }

    public boolean getMotor(){
        return motor;
    }

    public String toString(){
        return "Gas Tank is " + getGasTank() + " Pedal Number is " + getPedalNum()+" Motor is "+getMotor();
    }

    public void move(){
        if(this.getClass().getName().equals("Car") || this.getClass().getName().equals("Motorcycle") || this.getClass().getName().equals("Bicycle") || this.getClass().getName().equals("Bike")){
            System.out.println("This Vehicle can move");
        } else {
            System.out.println("This Vehicle can not move");
        }
    }

    public static void main(String args[]){
        Motorcycle motorOne = new Motorcycle(true,4,true);
        System.out.println(motorOne.getGasTank());
        System.out.println(motorOne.getPedalNum());
        System.out.println(motorOne.getMotor());
        System.out.println(motorOne.toString());
    }


}

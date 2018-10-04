package io.chris.training;
public class Motorcycle extends Vehicle{
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

    public static void main(String args[]){
        Motorcycle motorOne = new Motorcycle(true,4,true);
        System.out.println(motorOne.getGasTank());
        System.out.println(motorOne.getPedalNum());
        System.out.println(motorOne.getMotor());
        System.out.println(motorOne.toString());
    }


}

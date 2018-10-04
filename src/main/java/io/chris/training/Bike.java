package io.chris.training;
public class Bike extends Vehicle{
    protected String wheelShape;
    protected int wheelNum;
    protected String seatShape;

    public Bike(String wheelShape, int wheelNum, String seatShape){
        this.wheelShape=wheelShape;
        this.wheelNum=wheelNum;
        this.seatShape=seatShape;
    }

    //second method
    //public void getWS(String wheelShape){
//        this.wheelShape=wheelShape;
//    }

    public String getWheelShape(){
        return wheelShape;
    }

    public Integer getWheelNum(){
        return wheelNum;
    }

    public String getSeatShape(){
        return  seatShape;
    }

    public String toString(){
        return "Wheel Shape is " + getWheelShape() + " Wheel Number is " + getWheelNum()+" Seat Shape is "+getSeatShape();
    }

    public static void main(String args[]){
        Bike bikeOne = new Bike("Square",2,"Triangle");
        System.out.println(bikeOne.getWheelShape());
        System.out.println(bikeOne.getWheelNum());
        System.out.println(bikeOne.getSeatShape());
        System.out.println(bikeOne.toString());
    }



}

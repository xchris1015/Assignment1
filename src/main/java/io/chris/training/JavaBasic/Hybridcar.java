package io.chris.training.JavaBasic;
public class Hybridcar extends Car {

    protected String carType;


    public Hybridcar(float ml,double years,String maker,double price, double turbo, String carType, int mPH){
        super(ml,years,maker,price,turbo,mPH);
        this.carType = carType;
    }


    public String toString(){
        String str = super.toString();
        return str + "This is a " + carType + " car. And the MPH is "+ mPH + "per hour";
    }

    public String environmentalFriendlyCar(){
        if(carType.equals("Hybrid") || carType.equals("Electric") ){
            return "This is a environment friendly car";
        }else{
            return "This car is using gas!";
        }
    }

    public String mPHcompasion(Hybridcar a, Hybridcar b){
        if(a.mPH>b.mPH){ return a + "should be a hybrid or electric car";}else {return a +"should be a hybrid car";}
    }

    public static void main(String args[]){
        Hybridcar hybridCar1= new Hybridcar(20000,4,"Toyota",20000,2.0,"Hybrid",50);
        Hybridcar hybridCar2= new Hybridcar(1200,2,"Toyota",30000,3.0,"Electric",100);
        System.out.println(hybridCar1.toString());
        System.out.println(hybridCar1.environmentalFriendlyCar());
        System.out.println(hybridCar1.mPHcompasion(hybridCar1,hybridCar2));
	    System.out.println("This is added by Commend Line!");
	    System.out.println("This is added by nano!");
    }

}

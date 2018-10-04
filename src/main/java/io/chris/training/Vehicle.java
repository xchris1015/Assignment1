package io.chris.training;
import com.google.common.base.Strings;

import java.util.Random;
public class Vehicle {

    protected boolean registration;


    public boolean needLicensePlate(){
        if(this.getClass().getName().equals("Car") && this.getClass().getName().equals("Motorcycle")){
            return true;
        } else {
            return false;
        }
    }

    public String getLicensePlateNum(){
        // make sure does not have duplication
        Random rnd = new Random();
        Integer licensePlateNum = 100000 + rnd.nextInt(900000);
        return licensePlateNum.toString();
    }

    public boolean duplicationCheck(String a, String b){
        if(a.equals(b)){return false;} else {return true;}
    }

    public String toString(){
        if(this.getClass().getName().equals("Car") && this.getClass().getName().equals("Motorcycle")){
            return "This is a vehicle with a license plate number"+ getLicensePlateNum();
        }else {
            return "This is a bike or a bicycle that we do not assign the license plate number";
        }

    }


    public static void main(String args[]){
        String st = "chris";
        System.out.println(Strings.repeat(st,10));
    }

}

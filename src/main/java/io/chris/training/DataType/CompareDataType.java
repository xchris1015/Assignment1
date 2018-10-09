package io.chris.training;
public class CompareDataType {


    public static void main(String args[]){
        String a = new String("5555");
        String b = new String("5555");
        Integer aCapital = new Integer(10);
        Integer bCapital = new Integer(10);
        int inta = 10;
        int intb = 10;


        System.out.println(a==b);
        System.out.println(inta == intb);
        System.out.println(inta == aCapital);
        System.out.println(aCapital==bCapital);



    }
}

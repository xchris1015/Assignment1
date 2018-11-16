package io.chris.training.DataType;

public class StaticMethod {

    public static String list = "this is not a static method";

    public String notstaticmethod(String ls){
        return ls;
    }

    public static String staticmethod(){
        return "this is a static method";
    }

    public static void main(String args[]){
        StaticMethod sc = new StaticMethod();
        System.out.println(sc.notstaticmethod(list));
        StaticMethod.staticmethod();
    }
}

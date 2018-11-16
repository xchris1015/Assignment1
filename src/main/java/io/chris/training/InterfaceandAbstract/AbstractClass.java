package io.chris.training.InterfaceandAbstract;

public abstract class AbstractClass<Bike> implements Interface,Interface2 {
    public String testMethod(Bike bike){
        return "this is a bike";
    }

    public abstract String testMethodabstract(Bike bike);
}

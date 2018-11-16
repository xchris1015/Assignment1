package io.chris.training.Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Student implements Comparable<Student>{

    public int age;
    public String firstName;
    public String lastName;

    @Override
    public int compareTo(Student o) {
        if (this.lastName.equals(o.getLastName())){
            if(this.age==o.getAge()){
                return this.firstName.compareTo(o.getFirstName());
            }else{
                return this.age-o.getAge();
            }
        }else{
            return this.lastName.compareTo(o.getLastName());
        }
    }

    public Student(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String toString(){
        return this.lastName+this.age+this.firstName;
    }

    public static void main(String args[]){
        Student student1=new Student(32,"neo","xu");
        Student student2=new Student(26,"chris","xu");
        Student student3=new Student(25,"yishan","xu");
        Student student4=new Student(7,"te","cai");

        List list1= new ArrayList();
        list1.add(student2);
        list1.add(student1);
        list1.add(student4);
        list1.add(student3);

//        Comparator comparator = new Comparator();
//        Collections.sort(list1,comparator);
//        System.out.println(list1.toString());
        Collections.sort(list1);
        System.out.println(list1.toString());
    }
}

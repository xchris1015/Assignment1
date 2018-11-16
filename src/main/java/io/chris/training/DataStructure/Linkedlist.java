package io.chris.training.DataStructure;

public class Linkedlist {
    public Linkedlist next;
    public int value;

    public Linkedlist(int value) {
        this.value = value;
    }

    public static void main(String args[]){
        Linkedlist node1= new Linkedlist(5);
        Linkedlist node2= new Linkedlist(6);
        Linkedlist node3= new Linkedlist(7);
        Linkedlist node4= new Linkedlist(8);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;



    }
}

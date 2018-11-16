package io.chris.training.SetList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetList {

    public static void main(String args[]){
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();

        set.add("Geeks");
        set.add("For");
        set.add("Geeks");
        set.add("Example");
        set.add("Set");
        System.out.print("Set output without the duplicates");

        System.out.println(set);

        list.add("Geeks");
        list.add("For");
        list.add("Geeks");
        list.add("Example");
        list.add("Set");
        System.out.print("list output with the duplicates");

        System.out.println(list);

    }
}

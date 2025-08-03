package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAllIndexChange {
    public static void main(String[]args){

        ArrayList<String> List = new ArrayList<>();
        List.add("Apple");
        List.add("Banana");

        ArrayList<String> NewList = new ArrayList<>(Arrays.asList("Orange", "Grapes"));

        List.addAll(1,NewList);

        System.out.println("After Change Index: "+List);
    }
}

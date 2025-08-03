package org.example;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayAddAll {
    public static void main(String[]args){

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        ArrayList<String> AllFruits = new ArrayList<>(Arrays.asList("Grapes"));
        fruits.addAll(AllFruits);
        System.out.println(fruits);

//        System.out.println("ArrayList: "+fruits);
    }
}

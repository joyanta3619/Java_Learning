package org.example;

import java.util.ArrayList;

public class ArrayListFirst {
    public static void main(String[]args){
        ArrayList<String> names  = new ArrayList<>();

        ArrayList<Integer> age = new ArrayList<>();

        System.out.println("ArrayList : "+names);
        System.out.println("ArrayList : "+names.size());

//        ADD
        names.add("Akash");
        age.add(24);
        names.add("BaBa");
        age.add(63);
        names.add("MA");
        age.add(48);
        names.add("Bon");
        age.add(19);
        names.add("Didi");
        age.add(29);



        System.out.println("ArrayList : "+names);
        System.out.println("ArrayList of Age : "+age);
        System.out.println("ArrayList : "+names.size());              //Array Size
        System.out.println("Is Array is empty :"+names.isEmpty());    //array empty kina check
        System.out.println("Index value of 3 "+names.get(3));         //index value janar jnno


        names.remove("Akash");                                    //index theke value remove
        System.out.println(names);

       names.clear();                                               // Array Full clear korar jnno
        System.out.println("ArrayList: "+names);


        for(String name : names){
            System.out.println(name);
        }
    }

}

package org.example;
import java.util.ArrayList;
import java.util.List;
public class ArrayOther {
   public static void main(String[]args){
       List<String> fruits = List.of("Apple","Banana","Cherry");

       List<String> allFruits = new ArrayList<>(fruits);
       System.out.println(allFruits);

       System.out.println("Size of Array : "+allFruits.size());
       System.out.println("Is Array Empty :"+allFruits.isEmpty());
       System.out.println("Get Of 1 : "+allFruits.get(1));

       allFruits.set(1,"Mango");
       System.out.println("Update ArrayList : "+allFruits);   //index value change


   }

}

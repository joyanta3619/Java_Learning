package org.example;

public class MethodPractice {

    public static void sum(){
        int a =33;int b =20;
        int  c = a+b;
        System.out.println("MethodPractice sum is "+c);
    }

    public void sub(int a , int b){
        int c = a-b;
        System.out.println("Substract is "+c);
    }


    public static void main(String[]args){
        sum();


        MethodPractice obj = new MethodPractice();
        obj.sub(22,10);
        obj.sub(10,3);
    }
}

package org.example;

public class MethodExp {
    public void sum(int a, int b){
        int sum = a+b;
        System.out.println("Sum is "+sum);
    }

    public static void sub(int a , int b){
        int sub = a-b;
        System.out.println("Subtract:"+sub);
    }

    public static void main(String[]args){
        sub(10,3);
        sub(33,45);


        MethodExp summation = new MethodExp();
        summation.sum(22,4);
    }
}

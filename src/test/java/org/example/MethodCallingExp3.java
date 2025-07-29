package org.example;

public class MethodCallingExp3 {
    public static void main(String[]args){

        MethodExp obj = new MethodExp();     //MethodExp classs teke obj call kore value nie asci
        obj.sub(33,22);

        MethodExp2 object = new MethodExp2();   //MethodExp2 thke nici
        object.multiplication();

        MethodExp obj1 = new MethodExp();    //MethodExp classs teke obj call kore value nie asci
        obj.sum(22,33);

        MethodPractice obj2 = new MethodPractice();
        obj2.sub(22,33);


        MethodPractice.sum();  //Direct static theke main static  //MethodPractice theke
    }

}

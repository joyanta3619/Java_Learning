package org.example;

public class MethodExp2 {

//    Non static > Static and non static
   int a=3;
   static int b=3;

   public void multiplication(){
       int c = a*b;
       System.out.println("Multiplication is "+c);
   }

   public static void main(String[]args){
       MethodExp2 obj = new MethodExp2();
       obj.multiplication();
   }

}








//package org.example;
//
//public class MethodExp2 {
//
//    // Non-static and static variables
//    int a = 4;
//    static int b = 5;
//
//    // Non-static method
//    public void multi() {
//        int c = a * b;
//        System.out.println("Multiplication: " + c);
//    }
//
//    // Main method to run the code
//    public static void main(String[] args) {
//        MethodExp2 obj = new MethodExp2(); // Create object
//        obj.multi(); // Call non-static method
//    }
//}

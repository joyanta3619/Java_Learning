package org.example;

public class ArrayForLoopPractice {
    public static void main(String[] args) {

        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50,60};

        // Print all elements using for loop
        System.out.println("Array elements:");
        for(int i = 1; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Sum of array elements
//        int sum = 0;
//        for(int num : numbers) {
//            sum += num;
//        }
//        System.out.println("Sum of elements: " + sum);
    }
}

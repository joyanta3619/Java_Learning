package org.example;

public class SwitchCase {
    public static void main(String[] args){

//        System.out.println("Enter a number between 1 to 5:");
        int number = 15;

        switch (number) {
            case 1:
                System.out.println("You selected One");
                break;
            case 2:
                System.out.println("You selected Two");
                break;
            case 3:
                System.out.println("You selected Three");
                break;
            case 4:
                System.out.println("You selected Four");
                break;
            case 5:
                System.out.println("You selected Five");
                break;
            default:
                System.out.println("Invalid number!");
        }
    }
}

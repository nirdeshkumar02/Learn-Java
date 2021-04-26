package com.company;

import java.util.Scanner;

public class Ch_4_tut_3 {
    public static void main(String[] args) {
        // ---------------------------------- else if clause ------------------------------------------- //
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter Your Age");
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }
//

        //----------------------------- Switch Case ----------------------------------//
        switch (age){
            case 18:
                System.out.println("Your are going to become an adult");
                break;
            case 23:
                System.out.println("You are going to get a job");
                break;
            case 60:
                System.out.println("You are going to get restricted");
                break;
            default:
                System.out.println("Enjoy Your Life");
                break;
        }
        System.out.println("Thanks for coding");
        
        // ---------------------------- Enhanced Switch Case // ------------------------------//
        // ----------------------------------- it supports by java 14 and upper version ---------------- //
//        System.out.println("Enter name = ");
//        String name = sc.next();
//        switch (name){
//            case "Nirdesh" -> System.out.println("Your name is Nirdesh Kumar Saini");
//            case "Harry" -> System.out.println("Your name is Harry");
//            case "Moin" -> System.out.println("Your name is Moin");
//            default -> System.out.println("Your name is Sarvesh");
//
//        }
    }
}

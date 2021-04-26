package com.company;
import java.util.*;
// -------------------------------------- Practice Set -------------------------------------------- //
// --------------------------- Chapter 1 (Variable & Data Types) ----------------------------- //
public class Ch_1_tut_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);



        // Question 1- Program to sum three no.'s ? //
        System.out.println("Enter three no.'s continue:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int sum = a+b+c;
        System.out.println("Sum of three no.'s is = "+ sum);
        // --------------------------------------------//

        // Question 2- Program to ask user's name and wish him //
        System.out.println("Please enter your name");
        String name = scn.nextLine();
        System.out.println("Hello " +  name + " have a good day" );
        // -----------------------------------------------//

        // Question 3- Convert Km to Miles //
        System.out.println("Enter the value in Km = ");
        float km = scn.nextFloat();
        float miles = km * 0.6214f;
        System.out.println(km + " Km " + "=" + miles + " miles ");
        // ---------------------------------------------------//

        // Question 4- Program that checks no. is integer or not //
         System.out.println("Enter a value = ");
         boolean value = scn.hasNextInt();
        System.out.println(value);
    }

}

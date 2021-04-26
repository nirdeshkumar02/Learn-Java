package com.company;

import java.util.Scanner;

// ------------------------------------ Chapter 7 - Methods and Recursion ---------------------------------------- //

public class Ch_7_tut_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // -------------------------------- syntax of method ------------------------------------- //
                                 /*
                                    dataType name() {
                                          //Method body
                                     }
                                  */

   // ---------------------------------   we can call methods by using  two ways  --------------------------- //
            /*
             1. by using simple way and adding "Static" keyword in method //
                                         variable name = method name (parameter)   //Method call
         */


        /*
             2. by creating object //
                                      Calc obj = new Calc();   //Object Creation
                                      obj.mySum(a , b);      //Method call upon an object
         */

// -------------------------------------------------------------------------------------------------------------//
        System.out.println("Enter your first no. = ");
        int a = scn.nextInt();
        System.out.println("Enter your second no. = ");
        int b = scn.nextInt();
        int c = sum(a , b);
        System.out.println("The sum of two no. = "+c);
        Ch_7_tut_1 object = new Ch_7_tut_1(); // object created
        int d = object.minus(a,b);            // calling method through object
        System.out.println("The minus of two no. = "+d);

    }

    // ============================== sum method creating in simple way using static keyword ============================ //
    private static int sum(int x, int y) {
        return x+y;
    }
    // ============================== minus method using object ================================== //
    private int minus(int x, int y) {
        return x - y;
    }

}

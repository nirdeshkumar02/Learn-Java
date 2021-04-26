package com.company;
import java.util.*;
// --------------------------------------- Practice Set ----------------------------------------------------//
// ----------------------------- Chapter 2 (Operators & their associativity) -------------------------------//
public class Ch_2_tut_4 {
    public static void main(String[] args) {
        // Question 1- find the result of the expression //
        Scanner scn = new Scanner(System.in);
        float a = 7/4*9/2;
        float b = 7/4.0f * 9/2.0f;
        System.out.println("The value of a = "+a);
        System.out.println("The value of b = "+b);
        // --------------------------------------------- //

        // Question 2- encrypt a grade by adding 8 then decrypt it to correct value //
        char grade = 'B';
        grade += 8;
        System.out.println(grade);
        // -------------------------------------------------- //

        // Question 3- write the following expression in java //
        float V = scn.nextFloat();
        float u = scn.nextFloat();
        float m = scn.nextFloat();
        float s = scn.nextFloat();

        float ans = (V*V) - (u*u) / 2*m*s;
        System.out.println(ans);


    }
}

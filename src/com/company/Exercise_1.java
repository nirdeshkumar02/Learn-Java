package com.company;
import java.util.*;
public class Exercise_1 {
    public static void main(String[] args) {

        // --------------------------- Chapter 1 (Variable & Data Types) ----------------------------- //

        Scanner scn = new Scanner(System.in);
        System.out.println("<-------calculate your %------->");
        System.out.println("Enter the Sub1 marks = ");
        float sub1 = scn.nextFloat();
        System.out.println("Enter the Sub2 marks = ");
        float sub2 = scn.nextFloat();
        System.out.println("Enter the Sub3 marks = ");
        float sub3 = scn.nextFloat();
        System.out.println("Enter the Sub4 marks = ");
        float sub4 = scn.nextFloat();
        System.out.println("Enter the Sub5 marks = ");
        float sub5 = scn.nextFloat();
        scn.close();
        float sum = sub1+sub2+sub3+sub4+sub5;
        System.out.println("The sum of your subj = "+sum);
        float percent = (float)(sum*100)/500;
        System.out.println("Your percentage is = "+percent + " % ");
    }


}

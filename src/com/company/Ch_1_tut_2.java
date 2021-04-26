package com.company;
import java.util.*;
public class Ch_1_tut_2 {
    public static void main(String[] args) {
        // --------------------------- Chapter 1 (Variable & Data Types) ----------------------------- //

        System.out.println("<----------- Taking input from user ------------->");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the num1 = ");
        int a = scn.nextInt();
        float f1 = scn.nextFloat();
        System.out.print("Enter the num2 = ");
        int b = scn.nextInt();
        float f2 = scn.nextFloat();
        int sum = a+b;
        float sum2 = f1+f2;
        System.out.println("The sum of these num = "+sum);
        System.out.println("The sum of these float num = "+sum2);

        System.out.print("Enter a input = ");
        boolean b1 = scn.hasNextInt();
        System.out.println(b1);

        System.out.println("Enter a string = ");
        String str = scn.next();
        System.out.println(str);
        System.out.println("Enter a string = ");
        String str2 = scn.nextLine();
        System.out.println(str2);
    }
}

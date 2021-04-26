package com.company;

import java.util.Scanner;

// ----------------------------------- Practice set ---------------------------------------- //
public class Ch_4_tut_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //---------------------- Question 1 - What will be the output ----------------------//
        int a = 10;
        if(a==11){
            System.out.println("I'm 11");
        }
        else{
            System.out.println("I'm not 11");
        }
        // ------------------------------------------------------------------------------------//

        // -------------------------------- Question 2 - Write a program that's find student pass or not -------------------------------------//

        System.out.println("Enter the marks of subj 1 = ");
        int subj1 = scn.nextInt();
        System.out.println("Enter the marks of subj 2 = ");
        int subj2 = scn.nextInt();
        System.out.println("Enter the marks of subj 3 = ");
        int subj3 = scn.nextInt();
        float avg = (subj1+subj2+subj3)/3.0f;

        if (avg >= 40 && subj1 >=33 && subj2 >= 33 && subj3 >= 33){
            System.out.println("Congratulations, You have been promoted");
        }
        else{
            System.out.println("Sorry, You have not been promoted! Please try again.");
        }
        // -------------------------------------------------------------------------------------//

        // --------------------------- Question 3 - Find the tax payable by the employee ----------------------------//
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = scn.nextFloat();
        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is: " + tax);
        //--------------------------------------------------------------------------------------//

         // ---------------------- Question 4- Find the day ---------------------------------------------- //
        int day = scn.nextInt();

        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter valid day");
        }
        //---------------------------------------------------------------------------------//

        // ------------------------- Question 6 - find the website type-----------------------------//

        String website = scn.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
        //-------------------------------------------------------------------------------------------//
    }
}

package com.company;

import java.util.Scanner;

//--------------------------------- Practice Question -------------------------------------- //
public class Ch_6_tut_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // ------------------- Question 1 - Finding Odd and even no. from an array ------------------ //

        int[] num = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("The sum no. are = ");
        for(int i = 0; i<num.length; i++){
            if(num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }                                              // for loops //
        System.out.println();
        System.out.println("The Odd no. are = ");
        for(int i = 0; i< num.length; i++){
            if(num[i] %2 != 0){
                System.out.print(num[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Even no are = ");
        for(int i: num){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }                                            // using for each loops //
        System.out.println();
        System.out.println("Odd no are = ");
        for(int j: num){
            if(j%2 != 0){
                System.out.print(j+" ");
            }
        }

        //  ----------------------------------------------------------------------------------------- //

        // ------------------------------- Question - 2 check pass or fail -------------------------------//

        System.out.println("Enter the no. = ");
        int marks = scn.nextInt();
        if(marks>=35){
            System.out.println("You passed");
        }else{
            System.out.println("You failed");
        }

        //---------------------------------------------------------------------------------------------//

        //------------------- Question 3 - Eligibility Criteria Test Using Nested If ----------------------------//

        System.out.println();
        System.out.println("Enter the age = ");
        int age = scn.nextInt();
        System.out.println("Enter the height = ");
        int height = scn.nextInt();
        int currentAge = 16-age;
        if(age > 16 && height > 167){
            System.out.println("You are qualified to play");
        }
        else if(age > 16 && height < 167){
            System.out.println("you aren't qualified to play");
        }
        else if(age < 16 && height > 167 || height <167){
            System.out.println(" you are not qualified as of now, come back after "+ currentAge +" years " );
        }

        //------------------------------------------------------------------------------------------------------//

        //------------------- Question 4 - Finding Day Of The Week Using Switch Case ----------------------------//

        System.out.println();
        System.out.println("Enter the no from 1 to 7 = ");
        int day = scn.nextInt();
        switch (day){
            case 1:
                System.out.println("Today is MONDAY");
                break;
            case 2:
                System.out.println("Today is TUESDAY");
                break;
            case 3:
                System.out.println("Today is WEDNESDAY");
                break;
            case 4:
                System.out.println("Today is THURSDAY");
                break;
            case 5:
                System.out.println("Today is FRIDAY");
                break;
            case 6:
                System.out.println("Today is SATURDAY");
                break;
            default:
                System.out.println("Today is SUNDAY");
                break;
        }

        // ---------------------------------------------------------------------------------------------- //

        // --------------- Question 5 - Arrays and loops, product discount calculator. ------------------- //

        System.out.println("The current_price are = ");
            int current_price[] = {100,150,500,20};
            int n = current_price.length;
            for(int i = 0; i<n; i++){
                System.out.print(current_price[i]+" ");
            }
        System.out.println();
        System.out.println("Enter the discount % = ");
            int Discounted_price[] = new int[n];
            int discount = scn.nextInt();
        System.out.println("The new Discouted_price are = ");
            for(int i = 0; i< n; i++){
                Discounted_price[i] = (current_price[i] - (current_price[i] * discount)/100);
                System.out.print(Discounted_price[i]+" ");
            }
        System.out.println();




    }
}

package com.company;

import java.util.Scanner;

// ------------------------------------------ Practice set ---------------------------------------------//
public class Ch_6_tut_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       // ------------------ Question 1 - find the sum of 5 floats no. entered by the user ----------------------- //

//        float [] num = new float[5];
//        System.out.println("Enter the 5 floats no. = ");
//        for(int i =0; i<5; i++){
//            num[i] = scn.nextFloat();
//        }
//        float sum = 0;
//        for(float value: num){
//            sum += value;
//        }
//        System.out.println(sum);

        // ---------------------------------------------------------------------------------------------------------//

        // ----------------- Question 2 - Find out whether a no. is present in an array or not -----------------//

//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float num = 45.57f;
//        boolean isInArray = false;
//        for(float element:marks){
//            if(num==element){
//                isInArray = true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("The value is present in the array");
//        }
//        else{
//            System.out.println("The value is not present in the array");
//        }

        // ---------------------------------------------------------------------------------------------------------//

        // ---------- Question 3 - Calculate the average marks from an array using a for-each loop. -------------//

//        float[] mark = {36.5f, 28.6f, 49.6f, 50.0f, 85.6f, 29.8f};
//        float sum = 0;
//        for(float avg: mark){
//            sum = avg + sum;
//        }
//        System.out.println("The average marks = "+ sum/mark.length);

        // ---------------------------------------------------------------------------------------------------------//

        // ---------- Question 4 - Create a Java program to add two matrices of size 2x3. -------------//

//        int [][] mat1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int [][] mat2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int [][] result = {{0, 0, 0},
//                {0, 0, 0}};
//
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        // Printing the elements of a 2-D Array
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println(""); // Prints a new line
//        }

        // ---------------------------------------------------------------------------------------------------------//

        // ---------- Question 5 - Write a Java program to reverse an array. -------------//
//
//        int a[] = {4,6,8,10,15};
//        System.out.println("The reverse array = ");
//        for(int i = a.length-1; i>=0; i--){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();

        // ---------------------------------------------------------------------------------------------------------//

        // ---------- Question 6 - Write a Java program to find the maximum element in an array. -------------//

        int array[] = {45,20,69,85,40,65};
        int max = Integer.MIN_VALUE;
        for(int e: array){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);

        // ---------------------------------------------------------------------------------------------------------//

        // ---------- Question 5 - Write a Java program to reverse an array. -------------//



    }
}

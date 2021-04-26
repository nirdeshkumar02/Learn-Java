package com.company;

import java.util.Scanner;

// ------------------------------- Chapter 6 - Arrays ------------------------------------------ //
public class Ch_6_tut_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // classroom of 500 students and you have to store their marks -- now you have two options :
//        1) make 500 variable to store 500 students marks.
//        2) use array

        // represent of array - {"data type" [] "array's name" = new "datatype" [required blocks] }

        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
//         int [] marks = new int[5];

        // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];
        // Initialization
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;

        // 3. Declaration, memory allocation and initialization together
//        int [] marks = {98, 45, 79, 99, 80};

        // marks[5] = 96; - throws an error
//        System.out.println(marks[4]);

//        4. Taking user's input for creating array
        System.out.println("Enter the no. of students : ");
        int n = scn.nextInt();
        int [] marks = new int[n]; // creating array of students given by user's //

        System.out.println("Please enter the marks of students = ");
        for(int i =0; i<n; i++){                                                // taking user's marks for students //
            marks[i] = scn.nextInt();  // entering marks for students //
        }

        System.out.println("The marks of students = ");
        for(int i = 0; i< n; i++){
            System.out.print(marks[i]+" ");                       // Printing the marks for students //
        }







    }
}

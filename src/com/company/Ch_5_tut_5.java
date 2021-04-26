package com.company;

import java.util.Scanner;

public class Ch_5_tut_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // --------------------------------- Practice Set ------------------------------ //

        //----Question 1 - Write a program to print the following pattern ----------//
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        //--------------------------------------------------------------------------------//

        // Question 2 - Write a program to sum first n even numbers using a while loop. //
        System.out.println("Enter the value of n = ");
        int n = scn.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (2 * i);
        }
        System.out.println("sum of first " + n + " even no. is = " + sum);

        // ---------------------------------------------------------------------------------//

        // Question 3 - Write a program to print the multiplication table of a given number n. //

        System.out.println("Enter the no. of table = ");
        int table = scn.nextInt();
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = table * i;
            System.out.println(result);
//        }

            // ----------------------------------------------------------------------------------------------//

            // Question 4 - Write a program to print a multiplication table of 10 in reverse order. .//

            System.out.println("Enter the no. of reverse table = ");
            int reverse_table = scn.nextInt();
            int reverseResult = 0;
            for (int x = 10; x > 0; x--) {
                reverseResult = reverse_table * x;
                System.out.println(reverseResult);
//        }

                //-----------------------------------------------------------------------------------------------------//

                // Question 5 - Write a program to find factorial of a given number using for loops. //

                System.out.println("Enter the no. of the factorial = ");
                int factorialNO = scn.nextInt();
                int factResult = 1;
                for (int y = 1; y <= factorialNO; y++) {
                    factResult *= y;
                }
                System.out.println(factResult);

                // -------------------------------------------------------------------------------------------------- //

                // Question 6 - Write a program to calculate the sum of the numbers occurring in the multiplication table of 8. //

                int no = 8;
                int tableSum = 0;
                int tableOf8 = 0;
                for (int z = 1; z <= 10; z++) {
                    tableOf8 = no * z;
                    tableSum += tableOf8;
                    System.out.println(tableOf8);
                }
                System.out.println("The sum of no occuring in multiplication of 8 is : " + tableSum);
            }
        }
    }
}
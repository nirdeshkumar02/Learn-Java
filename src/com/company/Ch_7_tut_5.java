package com.company;
// --------------------------------------- Practice Set ----------------------------------------- //
import java.util.Scanner;

public class Ch_7_tut_5 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        System.out.println("Enter a no. = ");
        int n = scn.nextInt();

        System.out.println("The table of "+n);
        table(n);

        System.out.println("The patter of star for line "+n);
        pattern(n);

        System.out.println("The sum of "+n+" is = "+sum(n));

        System.out.println("The reverse pattern for line "+n);
        reversePattern(n);

        System.out.println("The fibonaaci series of "+n+ " no is : " + fib(n));

    }

    private static int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return (fib(n-1) + fib(n-2));
    }

    private static void reversePattern(int n) {
        for(int i = n; i>0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    private static int sum(int n) {
        if (n==0){
            return 0;
        }
        else{
            return n + sum(n-1);
        }
    }

    private static void pattern(int n) {
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    private static void table(int n) {
        int result = 0;
        for(int i =1; i<=10; i++){
            result = n * i;
            System.out.print(result+" ");
        }
        System.out.println();
    }
}




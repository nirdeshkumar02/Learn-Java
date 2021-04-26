package com.company;

public class Ch_7_tut_3 {
    public static void main(String[] args) {
        // ----------------------------------- Variable Arguments (VarArgs) in Java ------------------------------- //

        /*
            public static void foo(int … arr)
            {
                // arr is available here as int[] arr
            }
        */

        System.out.println("Welcome to varArgs tutorial");
        System.out.println("the sum of 4 and 5 is: "+ sum(4,5));
        System.out.println("the sum of 4 ,3 and 5 is: "+ sum(4,3,5));
        System.out.println("the sum of 2, 4, 3 and 5 is: "+ sum(2,4,3,5));

    }

    private static int sum(int ...arr) {
        // available as int [] arr;
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
     }
}

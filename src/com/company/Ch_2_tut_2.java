package com.company;
// ----------------------------- Chapter 2 (Operators & their associativity) -------------------------------//
public class Ch_2_tut_2 {
    public static void main(String[] args) {
        // precedences and associativity //
        // Precedence & Associativity

        int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        int b = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */

        System.out.println(a);
        System.out.println(b);

        // Quick Quiz
        int x =6;
        int y = 1;
        int k = x * y/2;

        int e = 0;
        int c = 0;
        int f = 10;
        int j = b*b - (4*a*c)/(2*a);
        System.out.println(k);


    }
}

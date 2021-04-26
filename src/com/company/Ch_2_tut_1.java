package com.company;
// ----------------------------- Chapter 2 (Operators & their associativity) -------------------------------//
public class Ch_2_tut_1 {
    public static void main(String[] args) {
        // Operators and Operations .... //
        // 1. Arithmetic Operators -------------------------
        int a = 4;
         int b = 6 % a; // Modulo Operator
        System.out.println(b);
        // 4.8%1.1 --> Returns Decimal Remainder

        // 2. Assignment Operators ----------------------------
        int b1 = 9;
        b1 *= 3;
        System.out.println(b1);

        // 3. Comparison Operators
         System.out.println(64<6);

        // 4. Logical Operators
         System.out.println(64>5 && 64>98);
        System.out.println(64>5 || 64>98);

        // 5. Bitwise Operators
        System.out.println(2&3);
        //        10
        //        11
        //        ----
        //        10
    }
}

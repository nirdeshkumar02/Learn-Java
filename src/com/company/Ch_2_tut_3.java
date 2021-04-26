package com.company;
// ----------------------------- Chapter 2 (Operators & their associativity) -------------------------------//
public class Ch_2_tut_3 {
    public static void main(String[] args) {
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b);

        // Increment and Decrement Operators
        int i = 56;
        // int b = i++; // first b is assigned i (56) then i is incremented
        int j = 67;
        int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println(c);
        int k = 7;
        System.out.println( ++k *8);
        char h = 'a';
        System.out.println(++h);
    }
}

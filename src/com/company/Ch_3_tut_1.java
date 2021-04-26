package com.company;
// ----------------------------- Chapter 3 (Strings) ------------------------------ //
public class Ch_3_tut_1 {
    public static void main(String[] args) {

        // -------------------- String as a Class, So creating Object of String Class -------------//
        String name = new String("Harry");
        System.out.println(name);

        // -------------------- String as a Data Type ------------------------- //
        String name2 = "Nirdesh";
        System.out.println(name2);

        //----------------- Print methods in Java ---------------//
        System.out.print("The name is:");
        System.out.print(name);

        System.out.println("The name is:");
        System.out.println(name);

        int a = 6;
        float b = 5.6547f;  // printf = format specifier (define %c for 'char' // %d for 'int' // %f for 'float' // %s for 'String')
        System.out.printf("The value of a is %d and value of b is %f", a,b);
        System.out.printf("The value of a is %d and value of b is %8.2f", a,b);
        System.out.format("The value of a is %d and value of b is %f", a,b);




    }
}

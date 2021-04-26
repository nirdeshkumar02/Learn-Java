package com.company;
import java.util.*;
// ----------------------------- Chapter 3 (Strings) ------------------------------ //
// -------------------------------- Practice Set ------------------------------- //
public class Ch_3_tut_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Question 1 - Convert a string to lower case //
        String str = "NIRDESH";
        System.out.println("A String to lower case: "+ str.toLowerCase());

        // Question 2 - replace spaces with underscore //
        String str2 = "   Nirdesh   ";
        System.out.println("String replaces with underscore: "+ str2.replace(' ','_'));

        // Question 3 - fill this template //
        String name = "Nirdesh";
        System.out.printf(" Dear %s, Thanks a lot", name);  //or//

        System.out.println();

        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>","Nirdesh");
        System.out.println(letter);

        // Question 4 - detect double and triple spaces in a string //
        String str3 = "This string contains double and  triple   spaces";
        System.out.println(str3.indexOf("  "));
        System.out.println(str3.indexOf("   "));

        // Question 5 - format letter using escape sequence character //
        String str4 = "Dear Harry,\n\tThis JAVA course is nice.\nThanks!" ;
        System.out.println(str4);







        // Question 5 -
    }
}

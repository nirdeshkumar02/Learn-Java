package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// -------------------------------- String Methods ------------------------------------ //
public class Ch_3_tut_3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(i);
        PrintWriter p = new PrintWriter(System.out, true);
        System.out.println("Enter a string here ");
        String str = b.readLine();

        // ----------------------------------------------------------------------- //

        // Return String Length //
        p.println(str.length());

        // ----------------------------------------------------------------------- //

        // Return character at index 15 //
        p.println(str.charAt(15));

        // ----------------------------------------------------------------------- //

        // Getting character from starting index to end //
        int start = 4;
        int end = 12;
        char[] tar = new char[end-start];
        str.getChars(start,end,tar,0);
        p.println(tar);

        // ----------------------------------------------------------------------- //

        // To charArray method, return a  character array //
        char[] c = str.toCharArray();
        for (char element : c) {
            p.println(element);
        }

        // ----------------------------------------------------------------------- //

        // Equals method return true or false //
        System.out.println("Enter the another String Here");
        String str2 = b.readLine();
        p.println(str.equals(str2));

        // ----------------------------------------------------------------------- //

        String s1 = "Hello There"; // 6 = index of s2 start in s1
        String s2 = "There"; // 0 = starting index of s2 //

        // Region Matches return boolean //
        p.println(str.regionMatches(6,str2,0,4));

        // Start with and ends with return boolean //
        p.println(s1.startsWith(s2));
        p.println(s1.endsWith(s2));

        // ----------------------------------------------------------------------- //

        // Find a substring in a string //

        p.println(str.substring(8)); // only starting index //
        p.println(str2.substring(4, 14)); // staring and ending index //

        // ----------------------------------------------------------------------- //

        // Concatenation and Replacing a string //

        p.println(str.concat(str2)); // or //
        p.println(str+str2);
        p.println(str.replace("Nirdesh", "Sarvesh")); // with word //
        p.println(str.replace("Nirdesh", str2)); // with a string //

        // ----------------------------------------------------------------------- //

        // converting string into upper case and lower case //

        p.println(str.toUpperCase());
        p.println(str2.toLowerCase());

        // ----------------------------------------------------------------------- //






    }
}

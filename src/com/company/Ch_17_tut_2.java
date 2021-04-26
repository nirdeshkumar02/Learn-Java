package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// ------------------------------ PrintWriter TO Print to the console ----------------------------------- //
public class Ch_17_tut_2 {
    public static void main(String[] args) {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(i);
        PrintWriter p = new PrintWriter(System.out, true);
        System.out.println("Type something here");
        try{
            String str = b.readLine();
            p.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package com.company;

import java.util.Date;

// ------------------------------------ The Date Class in Java (Deprecated) -------------------------------- //
public class Ch_15_tut_8 {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}

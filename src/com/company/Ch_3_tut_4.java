package com.company;
// ------------------------------------------- String Buffer and Its Methods ------------------------------- //
public class Ch_3_tut_4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Nirdesh");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.append("Kumar"));
        System.out.println(sb.insert(8, "Saini"));
//        System.out.println(sb.reverse());
        System.out.println(sb.delete(2,4));
        System.out.println(sb.deleteCharAt(3));
        System.out.println(sb.replace(3,6,"LOVE"));
        System.out.println(sb.substring(5));
        System.out.println(sb.substring(5,12));
        System.out.println(sb);
    }
}

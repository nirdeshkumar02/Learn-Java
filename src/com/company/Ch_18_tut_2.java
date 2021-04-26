package com.company;
// ------------------- Generic Methods and Generic Bounded Types --------------- //
public class Ch_18_tut_2 {
    public static void main(String[] args) {
        Generics demo = new Generics();
        demo.displayMessage("Hello There");
        demo.displayMessage(100);
    }
}
// Generics Method //
class Generics{
    public static <T> void displayMessage(T m){
        System.out.println(m);
    }
}



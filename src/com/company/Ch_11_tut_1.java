package com.company;
// ------------------------------------ Chapter - 11 Abstract Classes and Interfaces----------------------------- //
// ------------------------------------ Abstract Classes and Abstract Methods ------------------------------------ //
public class Ch_11_tut_1 {
    public static void main(String[] args) {
        //Parent p = new Parent(); -- error
        child c = new child();
        //child2 c2 = new Child2(); -- error
    }
}
abstract class Parent{
    Parent(){
        System.out.println("I am a constructor of Parent");
    }
    public void sayHello(){
        System.out.println("Hello G, I am Nirdesh");
    }
    abstract void greet();
    abstract void greet2();
}

// You have to add greet methods, if u don't want to make class abstract //
class child extends Parent{
    @Override
    void greet(){
        System.out.println("Good Morning");
    }

    @Override
    void greet2() {
        System.out.println("Good Night");
    }
}

// you have to make class abstract, if u don't want to add greet methods inherited from Parent //
abstract class child2 extends Parent{
    public void the(){
        System.out.println("I am good");
    }
}

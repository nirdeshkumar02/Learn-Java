package com.company;
// ----------------------------------------- Inheritance in Interfaces ---------------------------------------- //
public class Ch_11_tut_4 {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
interface SampleInterface{
    void meth1();
    void meth2();
}

interface ChildSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}

// ChildSampleInterface inherits the interface of its super class, so we have to implement meth1 and meth2 with meth3 & meth4 //

class MySampleClass implements ChildSampleInterface {

    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}

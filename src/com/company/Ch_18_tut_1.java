package com.company;
// ---------------------------------- Java Generics ------------------------------ //
// --------------------------- Implementing Generics with single and multiple Parameters ---------------------//
public class Ch_18_tut_1 {
    public static void main(String[] args) {
//        Demo <Integer> demo = new Demo<Integer>(100);
        Demo <String> demo = new Demo<String>("Hello this is the tutorial for java Generics");
        Demo2 <Integer, String> demo2 = new Demo2<Integer, String>(100, "hello");
        System.out.println(demo.getValue());
        System.out.println(demo2.getValue());
        System.out.println(demo2.getMessage());


    }
}
// Single parameter paas //

class Demo <T1>{
    T1 value;

    public Demo(T1 v){
        value = v;
    }

    T1 getValue(){
        return value;
    }
}

// Multiple parameter pass //

class Demo2 <T2, Y>{
    T2 value;
    Y message;
    public Demo2(T2 v, Y m){
        value = v;
        message = m;
    }
    T2 getValue(){
        return  value;
    }
    Y getMessage(){
        return message;
    }


}



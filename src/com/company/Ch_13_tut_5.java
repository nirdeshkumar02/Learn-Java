package com.company;
// ------------------------------------- Constructors from Thread class in Java ------------------------------- //
public class Ch_13_tut_5 {
    public static void main(String[] args) {
        /*
              ========> The Thread class ======>
                        Below are the commonly used constructors of thread class:-
                            * Thread( )
                            * Thread(string name)
                            * Thread(Runnable r)
                            * Thread(Runnable r, String name)
         */

        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Ram Candra");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());
    }
}
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 34;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}
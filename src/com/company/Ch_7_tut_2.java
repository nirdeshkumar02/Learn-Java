package com.company;
public class Ch_7_tut_2 {
    public static void main(String[] args) {
        // -------------------------- method reference and method overloading ---------------------------- //
        /*
        method overloading -- Two or more methods can have the same name but different parameters. Such methods are called Overloaded methods.
        Method overloading cannot be performed by changing the return type of methods.
         */

            // tellJoke();

            // Case 1: Changing the Integer
            int[] marks = {52, 73, 77, 89, 98, 94};
            int x = 45;
            change(x);
            System.out.println("The value of x after running change is: " + x);

            // Case 1: Changing the Array
            change2(marks);
            System.out.println("The value of x after running change is: " + marks[0]);


            // Method Overloading
            foo();
            foo(3000);
            foo(3000, 4000);
            // Arguments are actual!
        }
    public static void foo () {
        System.out.println("Good Morning bro!");
    }

    public static void foo ( int a){
        System.out.println("Good morning " + a + " bro!");
    }

    public static void foo ( int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    public static void foo ( int a, int b, int c){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    public static void change ( int a){
        a = 98;
    }

    public static void change2 ( int[] arr){
        arr[0] = 98;
    }
    public static void tellJoke () {
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }
    }


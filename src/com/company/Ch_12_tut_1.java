package com.company;
// --------------------------------------------- Chapter - 12 ------------------------------------------------- //
// -------------------------------------- Package, Interpreter and Compiler -------------------------------------- //
public class Ch_12_tut_1 {
    public static void main(String[] args) {
        C1 c = new C1();
         c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//         System.out.println(c.a);

    // -------------------------- Information About the Package, Interpreter and Compiler -------------------------- //
        /* A.
        ------------------------------- Interpreter Vs Compiler -----------------------------------------

            Interpreter = it translates one statement at a time into machine code.
            compiler = it scans the entire program and translates into machine code.

   ----------------- Interpreter ------------ == ------------ Compiler --------------------------
       1. one statement at a time             ==          1. Entire program at a time
       2. Interpreter is needed everytime     ==          2. once compiled iy is not needed
       3. Partial execution if error          ==          3. no execution if an error occurs
       4. Easy for programmers                ==          4. Visually not as easy as interpreted once

         */

        /* B.
        --------------------------------- Is Java Interpreted or Compiler Language -------------------------------

                * Java is a hybrid language both compiled as well as interpreted.
                * A JVM can be used to interpret this bytecode.
                * This bytecode can be taken to any platform ( win/ mac / linux ) for education.
                * Hence java is platform independent ( write once run everywhere ).

        ==>  "Java Program" --> COMPILED --> "Class File" --> INTERPRETED --> "Executed"
        ==> Example ==>
                         Harry.java --> COMPILED --> Harry.class --> INTERPRETED --> Result

         */

        /* C.
        ----------------------------------- Packages In Java ----------------------------------------

              * A package is used to group related class packages help in avoiding name conflicts.
              * There are two type of packages:- 1. Build in packages - java API
                                                 2. User defined packages - Custom packages
                        ==> Example ==>
                                        1. import java.util.* - import all inbuilt function
                                        2. import java.util.Scanner -  import string from java long
         */

        /* D.
        ----------------------------------- Access Modifiers --------------------------------------

                * Access modifies determine whether other class can use a particular field or
                    invoke a particular method can be public , private , protected or default ( no modifier ).

                    Y = Yes ; N = No

          <-------------- Modifiers  ===== Class ===== Packages ===== Subclass ===== World -------------->

          <--------------   Public   =====   Y   =====     Y    =====     Y    =====   Y    -------------->
          <-------------- Protected  =====   Y   =====     Y    =====     Y    =====   N    -------------->
          <--------------  Default   =====   Y   =====     Y    =====     N    =====   N    -------------->
          <--------------  Private   =====   Y   =====     N    =====     N    =====   N    -------------->

         */

        // ------------------------------------ Example of Access Modifiers ------------------------------------ //

    }
}
class C1{
    public int x = 5;
    protected int y =45;
    int z = 6;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

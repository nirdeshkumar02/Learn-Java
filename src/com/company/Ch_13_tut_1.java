package com.company;
// --------------------------------------------- Chapter - 13 ------------------------------------------------- //
// ------------------------------------------ Multithreading In Java ------------------------------------------ //
public class Ch_13_tut_1 {
    public static void main(String[] args) {

        /*

             * Multiprocessing and multithreading both are used to achieve multitasking.

              ==> In a nut shell.......
                * threads use shared memory area.
                * threads = faster content switching.
                * A thread is light-weight where a process is heavyweight.

               Example - A word processor can have one thread running in foreground as an editor and
                            another in the background auto saving the document !

              ==> Flow of control in java ==>

                * Without  threading:-

                        Main() ==> Function_1() ==> Function_2() ==> End

                * With threading:-

                        Main() ----------------------|
                                                     |
                                  Function_1() ----------------------> End()
                                                            |
                                       Function_2() --------|


              ==> Creating a Threading ==>

                                * There are two ways to create a thread in java
                                        1. By extending thread class.
                                        2. By implementing Runnable interface.
         */

    }
}

package com.company;
// ------------------------------------- Chapter - 17 -------------------------------------------- //
// ------------------------------- Java Input and Output ---------------------------------- //
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch_17_tut_1 {
    public static void main(String[] args) {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(i);
        System.out.println("Type Something Here");
        try{
            String sentence = b.readLine();
            System.out.println(sentence);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}

/*
<=====================================================================================================================>
===> Java has two types of streams: byte stream & character stream ---------
  1. Byte stream: Used for handling input and output of bytes, reading binary data.
  2. Character stream: Used for handling input and output of characters, they use Unicode.
    Both byte stream & character stream have a set of classes which help us perform I/O.

    ===> Byte stream classes ===>
        1. Byte stream classes can be further classified into InputStream and OutputStream.
        2. These classes further have subclasses that can handle I/O.
        3. The most important methods implemented by these classes are read() and write().
        4. Read and write are used to perform reading and writing of bytes of data.

    ===> Character stream classes ===>
        1. They can be classified as Reader & Writer classes.
        2. These two classes handle Unicode character streams.
        3. The most important methods implemented by these classes are read() and write().
        4. They perform reading and writing of characters of data.
<=====================================================================================================================>
 */

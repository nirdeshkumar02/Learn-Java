package com.company;

import java.io.*;

// ------------------------------ Reading and Writing Data from Files (File Handling) ------------------------------------ //
public class Ch_17_tut_3 {
    public static void main(String[] args) throws IOException {

        // Writing the data into the file //

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter the data you want to write in file");
        FileOutputStream fo = new FileOutputStream("demo.txt");
        String s =  br.readLine();
        byte []b = s.getBytes();
        fo.write(b);
        fo.close();

        // Reading the data from the file //
        FileInputStream f = new FileInputStream("demo.txt");
        try{
            int i =  f.read();
            while(i != -1){
                System.out.print((char) i);
               i = f.read();
            }
        }
         catch (IOException e) {
            e.printStackTrace();
        }
        f.close();

    }
}

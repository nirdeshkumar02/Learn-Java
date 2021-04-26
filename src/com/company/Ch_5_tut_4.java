package com.company;

public class Ch_5_tut_4 {
    public static void main(String[] args) {
        // ------------------- ------------------- Break & Continue Statement --------------------------------- //

        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        int i=0;
        do{
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }while(i<5);
        System.out.println("Loop ends here");


           for(int k=0;k<50;k++){
            if(k==2){
                System.out.println("Ending the loop");
                continue;
            }
                System.out.println(k);
                System.out.println("Java is great");
        }

            int j = 0;
            do {
                j++;
                if (j == 2) {
                    System.out.println("Ending the loop");
                    continue;
                }
                System.out.println(j);
                System.out.println("Java is great");

            } while (j < 5);
            System.out.println("Loop ends here");
        }
    }


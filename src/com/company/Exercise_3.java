package com.company;
import java.util.Random;
import java.util.Scanner;
public class Exercise_3 {
    public static void main(String[] args) {
        /*
        Question -- Create a class Game, which allows a user to play "Guess the Number" game once.

                 Game should have the following methods:
                            Constructor to generate the random number
                            takeUserInput() to take a user input of number
                            isCorrectNumber() to detect whether the number entered by the user is true
                            getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }

    static class Game {
        public int number;
        public int inputNumber;
        public int noOfGuesses = 0;

        public int getNoOfGuesses() {
            return noOfGuesses;
        }

        public void setNoOfGuesses(int noOfGuesses) {
            this.noOfGuesses = noOfGuesses;
        }

        Game() {
            Random rand = new Random();
            this.number = rand.nextInt(100);
        }

        void takeUserInput() {
            System.out.println("Guess the number");
            Scanner sc = new Scanner(System.in);
            inputNumber = sc.nextInt();
        }

        boolean isCorrectNumber() {
            noOfGuesses++;
            if (inputNumber == number) {
                System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
                return true;
            } else if (inputNumber < number) {
                System.out.println("Too low...");
            } else if (inputNumber > number) {
                System.out.println("Too high...");
            }
            return false;
        }

    }
}

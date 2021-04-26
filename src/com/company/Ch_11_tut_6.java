package com.company;
// -------------------------------- Practice Set ------------------------------------------ //
public class Ch_11_tut_6 {
    public static void main(String[] args) {
        // Q1 + Q2
        fountainPen pen = new fountainPen();
        pen.changeNib();

        // Q3
        humans harry = new humans();
        harry.sleep();

        // Q5
        monkey m1 = new humans();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

        basicAnimal lovish = new humans();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();
    }
}
// ----------------------------------------------- Question 1 and 2 -------------------------------------------------- //
abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountainPen extends pen {

    @Override
    void write() {
        System.out.println("Pen is used to write");
    }

    @Override
    void refill() {
        System.out.println("When pen ink is empty, Please refill it");
    }

    void changeNib(){
        System.out.println("Please Change your pen nib");
    }
}

// --------------------------------------------------------------------------------------------------------------- //

//------------------------------------------------ Question 3 ----------------------------------------------------- //
class monkey{
    void jump(){
        System.out.println("Jump");
    }
    void bite(){
        System.out.println("Bite");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}

class humans extends monkey implements basicAnimal {

    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

// --------------------------------------------------------------------------------------------------------------- //

//------------------------------------------------ Question 4 ----------------------------------------------------- //


package com.company;
// ----------------------------------- Chapter - 10_ Practice Set ------------------------------------------------ //
public class Ch_10_tut_6 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.area();
        Cylinder1 cy = new Cylinder1(4,5);
        cy.volume();



    }
}
class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public void area(){
        System.out.println("The area of circle is = "+Math.PI*this.radius*this.radius);
    }
}
class Cylinder1 extends Circle{
    int height;
    Cylinder1(int radius ,int height){
        super(radius);
        System.out.println("This is parameterized constructor");
        this.height = height;
    }
    public void volume(){
        System.out.println("The volume of cylinder is "+Math.PI*this.radius*this.radius*this.height);
    }
}
package com.company;
// ------------------------------- Practice Set ---------------------------------------------- //
// ================================== Constructor and Access Modifiers ============================= //
public class Ch_9_tut_3 {
    public static void main(String[] args) {

        Cylinder myCylinder = new Cylinder(9 , 12);
//        or
//        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // Problem 2

        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        Rectangle r = new Rectangle(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

    }
}

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int r, int h) {
        radius = r;
        height = h;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double surfaceArea(){
        return 2 * Math.PI * radius * radius +  2 * Math.PI * radius * height;
    }

    public double volume(){
        return Math.PI * radius * radius * height;
    }
}


class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

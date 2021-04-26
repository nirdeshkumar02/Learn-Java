package com.company;

/*
         You have to create a package named shape
          This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
          These classes should use inheritance to properly manage the code!
          Include methods like volume, surface area and getters/setters for dimensions
 */
public class Exercise_5 {
    public static void main(String[] args) {

    }
}
class shape{
    int dim1, dim2;
    shape(int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int getDim1() {
        return this.dim1;
    }

    public int getDim2() {
        return this.dim2;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }
}
class rectangle extends shape{

    rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public int area(){
        return this.dim1 * this.dim2;
    }
}

class square extends shape{

    square(int dim1) {
        super(dim1, -1);
    }

    public int area(){
        return this.dim1 * this.dim1;
    }
}
class circle extends shape{

    circle(int dim1) {
        super(dim1, -1);
    }
    public double area(){
        return Math.PI * this.dim1 * this.dim1;
    }
}
class cylinder extends shape{

    cylinder(int dim1, int dim2) {
        super(dim1, dim2);
    }
    public double area(){
        return 2 * Math.PI * this.dim1 * (this.dim2 + this.dim1);
    }
}
class sphere extends shape{

    sphere(int dim1) {
        super(dim1, -1);
    }
    public double area(){
        return 4 * Math.PI * this.dim1 * this.dim1;
    }
}

package com.company;
// ---------------------------------- Chapter 8 - OOP's Concept -------------------------------------------- //

public class Ch_8_tut_1 {
    // --------------------------------  Object Oriented Programing --------------------------- //
    // -------------------------------- Chapter 8 - JAva Class ------------------------------------- //
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        // Instantiating a new employee object //
        Employee harry = new Employee();  // object of class //
        // setting properties to the employee //
        harry.id = 12;
        harry.name = "Code With Harry";
        harry.salary = 20000;
        harry.printDetails(); // calling method which is inside other class //

        // Instantiating a new employee object //
        Employee Nirdesh = new Employee(); // object of class //
        // setting properties to the employee //
        Nirdesh.id = 15;
        Nirdesh.name = "Nirdesh Kumar Saini";
//        Nirdesh.salary = 50000;
        Nirdesh.printDetails(); // calling method which is inside other class //

        System.out.println(harry.getSalary()); // print single attribute //

        // printing attributes //
//        System.out.println(harry.id);
//        System.out.println(harry.name);
    }
}
class Employee{ ///////// this is the custom class that i have created
    int id;
    String name;
    int salary;

    public void printDetails(){ // method //
        System.out.println("My name is "+name+". My id is "+ id + " and My salary is "+ salary);
    }

    public int getSalary(){
        return salary;
    }

}


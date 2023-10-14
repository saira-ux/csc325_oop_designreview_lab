/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
// ToDo 1: Make this class a child of Human
public class Student extends Human {
    private double gpa; // ToDo 3: Add a field for GPA

    // ToDo 6: Fix the constructor of the Student class
    public Student(String name, short age) {
        super(name, age);
    }

    // ToDo 11: Add a constructor for the Freshman class
    public Student(String name, short age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    // ToDo 4: Add setter and getter for GPA
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    @Override
    public String getAddress() {
        // Provide a dummy implementation or return null if it's not used in the Student class
        return null;
    }

    @Override
    public void setAddress(String address) {
        // Provide a dummy implementation or do nothing
    }
    
    // ToDo 9: Add a toString method for the Student class
    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", GPA: " + gpa;
    }
}

// ToDo 7: Create two classes for Freshman and Senior
class Freshman extends Student {
    // ToDo 11: Add a constructor for the Freshman class
    public Freshman(String name, short age, double gpa) {
        super(name, age, gpa);
    }

    
    // ToDo 10: Add a toString method for the Freshman class
    @Override
    public String toString() {
        return "Freshman - Name: " + getName() + ", Age: " + getAge() + ", GPA: " + getGpa();
    }
}

class Senior extends Student {
    private int credits;

    public Senior(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }


    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Senior - Name: " + getName() + ", Age: " + getAge() + ", Credits: " + credits;
    }

}



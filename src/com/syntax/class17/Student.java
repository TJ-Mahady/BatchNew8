package com.syntax.class17;

public class Student {

    String name;
    int age;
    double marks;
    String collegeName;
    static int numberOfStudentsEnrolled=10;

    public void printInfo(){
        System.out.println("Name "+name+" Age "+age+" Marks "+marks);
    }
    public void printMarks(){
        System.out.println("Marks "+marks);
    }
    public void StudentsRegistered(){
        System.out.println("");
    }
}

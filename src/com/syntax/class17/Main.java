package com.syntax.class17;

public class Main {
    public static void main(String[] args) {
        /*Variables variables=new Variables();
        variables.varsDemo();
        variables.varsDemo1();*/

        Student student=new Student();
        student.name="TJ";
        student.age=29;
        student.marks=90;
        Student.numberOfStudentsEnrolled++;


        Student student2=new Student();
        student.name="Danilo";
        student.age=30;
        student.marks=80;
        System.out.println(student2.numberOfStudentsEnrolled);

        Student student3=new Student();
        student.name="Ilya";
        student.age=34;
        student.marks=98;
        System.out.println(student3.numberOfStudentsEnrolled);


    }
}

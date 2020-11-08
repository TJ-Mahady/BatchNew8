package com.syntax.class20;

public class Task3 {
    String name;
    int age;
    double salary;



    private Task3(String name){
        //i can only create objects of my class from the same class
        this.name=name;
    }
    Task3(int age){
        this.age=age;
    }
    public Task3(double salary){
        this.salary=salary;
    }

    public static void main(String[] args) {
        /*Task3 task1=new Task3("Marta");*/

        Task3 task1=new Task3("Marta");
        System.out.println(task1.name);
        System.out.println(task1.age);
        System.out.println(task1.salary);

        Task3 task2=new Task3(12);
        System.out.println(task2.name);
        System.out.println(task2.age);
        System.out.println(task2.salary);

        Task3 task3=new Task3(10000.00);
        System.out.println(task3.name);
        System.out.println(task3.age);
        System.out.println(task3.salary);

    }
}

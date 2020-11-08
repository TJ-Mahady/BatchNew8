package com.syntax.class20;

public class Person {

    String name;
    String address;
    int age;
    String id;
    String phone;
    String SSN;
    char gender;
    char maritalStatus;
    double height;
    double weight;
    int numberOfKids;
    double salary;
    String education;

    Person(String name,int age,String phone,double salary){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        System.out.println("I am the first constructor, i only have 4 fields as mandatory");

    }
    Person(String name,int age,String phone,double salary,char maritalStatus,int numberOfKids){
        this(name, age, phone, salary);
        this.maritalStatus=maritalStatus;
        this.numberOfKids=numberOfKids;
        System.out.println("I am the first constructor, i only have 6 fields as mandatory");


    }
    Person(String name,int age,String phone,double salary,char maritalStatus,int numberOfKids,String education){
        this(name, age, phone, salary, maritalStatus, numberOfKids);
        this.education=education;


        System.out.println("I am the first constructor, i only have 7 fields as mandatory");

    }

    public static void main(String[] args) {
        Person person=new Person("Khalid",33,"123456333",0,'M',0,"SDET");

        Person person1=new Person("Khalid",33,"123456333",0);
    }

}

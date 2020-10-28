package com.syntax.class13;

public class SmartPhone {

    String brand;
    String color;
    String model;



    void call(String phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }

    void text(String text){
        System.out.println(brand+model+" sends text "+text);
    }
    void pics() {
        System.out.println(brand+" taking a picture");
    }
    void dial(){
        System.out.println(brand+" stuff");
    }

}

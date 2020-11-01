package com.syntax.class16;

public class BreakTask4 {
    static void sayHello(String countryName){

        switch (countryName){
            case "USA":
                System.out.println("Hola");
                break;
            case "China":
                System.out.println("Ni hao");
                break;
            case "Turkey":
                System.out.println("Merhaba");
                break;
            default:
                System.out.println("Country not supported");

        }

    }
}

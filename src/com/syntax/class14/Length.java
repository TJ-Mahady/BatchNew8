package com.syntax.class14;

public class Length {
    public static void main(String[] args) {

        String name="TJ";
        System.out.println(name.length());
        name="";
        System.out.println(name.length());
        name="TJ Mahady";
        System.out.println(name.length());
        name="    TJ    ";
        System.out.println(name.length());

        if (name.length()>=10) {
            System.out.println("You are great");

        }

    }
}

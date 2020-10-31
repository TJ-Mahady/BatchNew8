package com.syntax.class15;

public class StringBuilderClass {
    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder("Hello");
        stringBuilder.append(" World");
        String string="Hello";
        string.concat("World");
        System.out.println(string);
        System.out.println(stringBuilder);


    }


}

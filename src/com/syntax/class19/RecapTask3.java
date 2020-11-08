package com.syntax.class19;

public class RecapTask3 {

    private static String VowelsOnly(String name){

       return name.replaceAll("[^AEIOUaeiou]","");

    }

    public static void main(String[] args) {

        System.out.println(VowelsOnly("All the vowels will be removed"));
    }

}

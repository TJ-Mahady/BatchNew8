package com.syntax.class19;

public class Constructor {

        int number;
        String name;
        char character;

        Constructor(){
            System.out.println("I will be called everytime you create an object of this class");
        }


     void print(){
        System.out.println("Number "+number+" name "+name+" Character "+character);
    }

    public static void main(String[] args) {
       Constructor constructors = new Constructor();
       constructors.print();

        /*print();
        int num;
        System.out.println(num);*/
    }
}

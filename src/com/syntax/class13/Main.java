package com.syntax.class13;

public class Main {
    public static void main(String[] args) {

        Dog dog1=new Dog();

        dog1.breed="Mix";
        dog1.size="medium";
        dog1.age=4;
        dog1.color="yellow";
        dog1.name="Benjen";

        dog1.bark();
        dog1.fetch();
        dog1.play();


        SmartPhone phone = new SmartPhone();
        phone.brand="Samsung";
        phone.color="black";
        phone.model="S 10";
        phone.call("7969994494");
        phone.text(" Find a bug ");
        phone.dial();

    }
}

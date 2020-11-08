package com.syntax.class20;

public class BreakTask {

    String name;
    String address;
    BreakTask(String name,String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo() {
        System.out.print(name+" ");
        System.out.println(address);
    }
    public static void main(String[] args) {
        BreakTask studentA=new BreakTask("john","123 Fairfax");
        studentA.displayInfo();
        BreakTask studentB=new BreakTask("karim","123 Algiers");
        studentB .displayInfo();
    }
}


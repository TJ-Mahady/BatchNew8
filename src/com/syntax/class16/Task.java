package com.syntax.class16;

public class Task {
    public static void main(String[] args) {
        String input="Backwards racecar";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1=input1.reverse();
        System.out.println(input1);
    }
}

package com.syntax.class15;

public class Task {
    public static void main(String[] args) {

        String string="Strings";
        int length=string.length();

        if(!string.isEmpty()) {
            if (length>3 && length%2!=0){
                System.out.println(string.charAt(length/2));
            }
        }



    }
}

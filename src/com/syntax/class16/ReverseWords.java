package com.syntax.class16;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence="Whats for dinner?";
        String[] stringArray=sentence.split(" ");


        for(int i=0;i<stringArray.length;i++) {
            StringBuilder stringBuilder=new StringBuilder(stringArray[i]);
            stringArray[i]=stringBuilder.reverse().toString();
        }
        System.out.println(Arrays.toString(stringArray));


    }
}

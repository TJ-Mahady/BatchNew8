package com.syntax.class16;

public class BreakTask3 {
    public void isStringpalindrome(String string) {
        int i=0;
        int j=string.length()-1;
        while(i<j){
            if(string.charAt(i)!=string.charAt(j)){
                System.out.println("String is not Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("String is a Palindrome");
    }
}

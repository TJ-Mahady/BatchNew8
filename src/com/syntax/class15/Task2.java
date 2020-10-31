package com.syntax.class15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String momsName,dadsName,gender,babyName;

        System.out.println("Please enter moms name");
        momsName=input.nextLine();
        System.out.println("Please enter dads name");
        dadsName=input.nextLine();
        System.out.println("Is it a boy or girl?");
        gender=input.nextLine();

        if(gender.toLowerCase().startsWith("b")) {
            String firstPart= dadsName.substring(0,dadsName.length()/2);
            String secondPart= momsName.substring(momsName.length()/2);
            babyName= firstPart+secondPart;
        }else if(gender.toLowerCase().startsWith("g")) {
            String firstPart= momsName.substring(0,dadsName.length()/2);
            String secondPart= dadsName.substring(dadsName.length()/2);
            babyName= firstPart+secondPart;
        }else {
            babyName="No suggestions";
        }
        System.out.println(babyName);

    }
}

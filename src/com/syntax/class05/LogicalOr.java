package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {

		String day = "Sunday";

		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today I have java class");
		}

		System.out.println("The End");
		
		System.out.println("-----More Examples-----");
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter todays day using numbers only from 1-7");
		
		int today=input.nextInt();
		
		if (today==1 || today==5) {
			System.out.println("I am off");
		}else if(today==2 || today==3) {
			System.out.println("GIT Class");
		}else if(today==4) {
			System.out.println("Review Class");
		}else if(today==6 || today==7) {
			System.out.println("Java Class");
		}else {
			System.out.println("Please enter valid day from 1-7");
		}
		

	}

}

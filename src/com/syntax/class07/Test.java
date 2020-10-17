package com.syntax.class07;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		String grade;
		String message;
		
		System.out.println("Please enter grade as a single letter");
		
		grade=input.nextLine();
		
		
		
		switch (grade) {
			
			case "A": 
				message = "Excellent";
				break;
				
			case "B" :
				message = "Good";
				break;
				
			case "C" :
				message = "Average";
				break;
			case "D" : 
				message= "Bad";
				break;
				
			default :
				message= "Not Acceptable";
				
			
		}
		
		System.out.println("Your grade is "+grade+" your work is "+message);
		
	}



	}



package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		/*
		 * variable for allergy- yes or no
		 * 
		 * if allergy is yes-->
		 * 
		 * 			we will check if pet allergy
		 * 							peanut allergy
		 * 							pollen allergy
		 * 
		 * if no allergies, you are lucky!!!
		 */
		
		
		boolean allergy=true;
		
		boolean peanutAllergy=true;
		
		boolean petAllergy=true;
		
		boolean pollenAllergy=true;
		
		if (allergy) {
			System.out.println("Let's do further checks...");
			
			if(petAllergy) {
				System.out.println("Don't have pets");
			}
			
		}else {
			System.out.println("You are lucky");
		}
		
		System.out.println("-------EXAMPLE 2-------");
		
		/*
		 * if today is Friday, we will watch a movie. but would like to check the date
		 * 			if date is 13-->we will watch a scary movie	 
		 * 			and if it is not --> I will watch a comedy, action
		 * 
		 * if not Friday--> I am studying
		 */ 
		
		boolean isFriday=true;
		int date=14;
		boolean monday=false;
		
		if(isFriday) {
			
			if(date==13) {
				System.out.println("I will watch a scary movie");
			}else {
				System.out.println("I will watch Pineapple Express");
			}
			
		}else {
			
			if(monday) {
				System.out.println("I am not studying, I am working");
			}else {
				System.out.println("I have class at Syntax");
			}
		}
		
		System.out.println("-------EXAMPLE 3-------");
		
		/*
		 * check if assignment is completed
		 * if assignment is completed:
		 * 					if score is >90--> great job
		 * 					if score is >80 --> good job
		 * 					if score is >70 --> study more 
		 */
		
		int score =82;
		boolean assignment =true;
		
		if (assignment) {
			
			if(score>90) {
				System.out.println("Great job!!");
			}else if(score>80) {
				System.out.println("That'll do pig");
			}else if(score>70) {
				System.out.println("Study More!");
			}else {
				System.out.println("Thank you for failing");
			}
			
		}else {
			System.out.println("You should always complete all assignments");
		}
	
	}

}

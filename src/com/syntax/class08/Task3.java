package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			System.out.println("Please enter a range of numbers");
			
			int num1=input.nextInt();
			int num2=input.nextInt();
			int sum1=0; int sum2=0;
			
			for(int i=num1; i<=num2; i++) {
				if (i%2==0) {
					sum1 += i;
				}
				if (i%2 !=0) {
					sum2 += i;
				}
				
				
			}
		
		System.out.println("sum1 is "+sum1);
		System.out.println("sum2 is "+sum2);

	}

}

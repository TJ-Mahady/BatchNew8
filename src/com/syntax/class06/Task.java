package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		boolean sale;
		double price, discount, finalPrice;
		
		System.out.println("Enter boolean value if there is a sale or not");
		
		sale=input.nextBoolean();
		
		if (!sale) {
			System.out.println("We are not going shopping");
			
		}else {
			System.out.println("We are going shopping");
			
			
               System.out.println("What is the price?");
			
			price=input.nextDouble();
			
			if (price>10 && price<50) {
				discount= price*0.1;
			}else if (price>=50 && price<100) {
				discount= price*0.2;
			}else if (price>=100 && price<500) {
				discount= price*0.4;
			}else if (price>=500) {
				discount= price*0.5;
		    }else {
		    	discount=0;
		    }
			
			finalPrice=price - discount;
			
			System.out.println("Your product is $"+price+" and you get $"+discount+" discount, and you will pay $"+finalPrice);
		}
		
		

	}

}

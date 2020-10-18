package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner input;
		int money; 
		int waterPrice=5;
		
		input=new Scanner(System.in);
		
		System.out.println("Please pay for your water!");
		
		money=input.nextInt();
		
		while(money!=waterPrice) {
			if (money>waterPrice) {
				System.out.println("This is too much, please enter less money");
			}else {
				System.out.println("Water is expsensive, please insert more money");
			}
		}
			System.out.println("Enjoy your water");
	}

}

package com.syntax.class12;

import java.util.Scanner;

public class HWTask2 {

	public static void main(String[] args) {

		// Write a java program to check whether a given number is prime or not?

		
		boolean prime = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");

		int num = input.nextInt();
		
		if (num>1) {

		for (int i = 2; i <= num / 2; i++) {
			int check = num % i;
			if (check == 0) {
				prime = false;
			}
		}
		}else {
			prime=true;
		}
		if (prime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");

	}

}

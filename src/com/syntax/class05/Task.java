package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How many years did you work?");

		int year = input.nextInt();
		if (year >= 5) {
			System.out.println("You are eligible for a bonus");
			System.out.println("How much is your salary?");
			double salary = input.nextDouble();
			if (salary > 50000) {
				System.out.println("Your bonus is 50000");
			} else {
				System.out.println("Your bonus is 3000");
			}

		} else {
			System.out.println("You are not eligible for the bonus");
		}

	}

}

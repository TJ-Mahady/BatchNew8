package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {

		Scanner input;
		int number;

		input = new Scanner(System.in);

		System.out.println("Please enter any number");

		number = input.nextInt();

		if (number > 0 && number <= 10) {
			System.out.println("The number is small");
		} else if (number > 10 && number <= 100) {
			System.out.println("The number is medium");
		} else if (number > 101 && number <= 1000) {
			System.out.println("The number is large");
		}

	}

}

 package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter height in inches");

		int height = input.nextInt();

		if (height < 60) {
			System.out.println("Short");
		} else if (height > 60 && height <= 72) {
			System.out.println("Meduim");
		} else {
			System.out.println("Tall");
		}

	}

}

package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int day;
		String today;

		System.out.println("Enter day as a number");

		day = input.nextInt();

		switch (day) {

		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;
		default:
			today = "invalid day";
			break;
		//break ^^ is optional on the last statement
		}

		System.out.println("Today is " + today);

	}

}

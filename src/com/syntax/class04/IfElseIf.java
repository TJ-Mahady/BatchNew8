package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {

		int num1 = 99;
		int num2 = 99;

		if (num1 > num2) {
			System.out.println(num1 + " Is bigger than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		System.out.println("--------------------------------------");

		int day = 9;

		if (day == 1) {
			System.out.println("Today is Monday, we have no class");
		} else if (day == 2) {
			System.out.println("Today is Tuesday, we have Manual class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday and we have Manual class again");
		} else if (day == 4) {
			System.out.println("Today is Thursday and we have review class");
		} else if (day == 5) {
			System.out.println("Today is Friday, no class, but i will prepare for tomorrow");
		} else if (day == 6) {
			System.out.println("today is Saturday, I have class");
		} else if (day == 7) {
			System.out.println("Today is Sunday, I did a lot of coding");
		} else {
			System.out.println("This is invalid entry, please provide valid day from 1 to 7");
		}

	}

}

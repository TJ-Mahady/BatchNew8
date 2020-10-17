package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner input;
		String browser;
		String message;

		input = new Scanner(System.in);

		System.out.println("Please enter browser");

		browser = input.nextLine();

		switch (browser.toLowerCase()) {

		case "safari":

			message = "Your code will be executed on the Safari browser";
			break;

		case "chrome":

			message = "Your code will be executed on the Chrome browser";
			break;

		case "firefox":
			message = "Your code will be executed on the Firefox browser";
			break;

		default:
			message = "Entered browser is not supported";

		}

		System.out.println(message);
		
		//switch does not work with double, float, and long
		//Switch case cannot use relational or logical operators
		
		
	}

}

package com.syntax.class02;

public class ArithematicPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double val1 = 5.55;
		double val2 = 6.66;

		double add = val1 + val2;
		double min = val2 - val1;
		double mult = val1 * val2;
		double div = val1 / val2;

		System.out.println("The addition of 2 numbers " + val1 + " and " + val2 + " is equal to "+ add);
		System.out.println("The subtraction of 2 numbers " + val1 + " and " + val2 + " is equal to " + min);
		System.out.println("The multiplication of 2 numbers " + val1 + " and " + val2 + " is equal to " + mult);
		System.out.println("The division of 2 numbers " + val1 + " and " + val2 + " is equal to " + div);

		double num1 = 3.9;
		double num2 = 3.9 * 2;

		System.out.println("The square of " + num1 + " is " + num2);

		int width = 5;
		int height = 8;
		int area = 5 * 8;
		int per = 2 * 5 + 8;

		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+per+" and the area is "+area);

	}

}

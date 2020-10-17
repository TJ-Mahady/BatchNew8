package com.syntax.class04;

public class Task3 {

	public static void main(String[] args) {

		double mortgageRate = 4.6;
		int mortgagePrice = 100000;

		if (mortgageRate > 4.5) {
			System.out.println("User will not consider buying a house");
		} else {
			System.out.println("User will condiser buying the house");
			if (mortgagePrice > 200000) {
				System.out.println("User will take out a loan");
			} else {
				System.out.println("User will pay cash");
			}

		}

	}
}

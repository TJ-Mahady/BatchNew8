package com.syntax.class04;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		String name = "Asghar";
		String pass = "pass123";

		double accountBalance = 10.25;
		double transferAmount = 8;
		boolean transAllowed = true;
		if (pass.equals("pass123")) {
			System.out.println("Welcome the syntax bank!");
			if (transAllowed) {
				System.out.println("initiating transfer");
				if (transferAmount > accountBalance) {
					System.out.println("Insufficient balance");
				} else {
					System.out.println("Transfer complete");
				}

			} else {
				System.out.println("you are not allowed to transfer");
			}
		} else {
			System.out.println("invalid credentials please tray again");
		}

	}

}

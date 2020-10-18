package com.syntax.class08;

public class Task {

	public static void main(String[] args) {

		for (int a = 20; a >= 1; a--) {
			if (a % 2 == 0)
				System.out.print(a + " ");
		}
		System.out.println(" ");
		System.out.println("-------");

		for (int b = 20; b >= 2; b--) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println(" ");
		System.out.println("---------");

		for (int c = 20; c <= 50; c++) {
			if (c % 2 == 1) {
				System.out.print(c + " ");
			}

		}
		System.out.println(" ");
		System.out.println("--------");
		for (int d = 21; d <= 50; d++) {
			System.out.print(d + " ");
			d++;
		}
		System.out.println(" ");
		System.out.println("--------");

		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		System.out.println(" ");
		System.out.println("--------");

		int a;
		for (a = 1; a < 6; a++) {
			System.out.println("Value of a inside the loop " + a);
		}
		System.out.println("Value for a outside of loop " + a);

		System.out.println(" ");
		System.out.println("--------");

		int result = 1;

		for (int i = 10; i >= 1; i-=2) {
			result *= i;

		}
		System.out.println(result);
		
		
	}

}

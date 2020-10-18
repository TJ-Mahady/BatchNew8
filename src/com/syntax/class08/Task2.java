package com.syntax.class08;

public class Task2 {

	public static void main(String[] args) {

		int sum1 =0;
		int sum2 =0;
		
		for (int i=1; i<51; i++) {
			if((i%2) !=0) {
				sum2 +=i;
			}else {
				sum1 +=i;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		
		System.out.println("-_-_-_-_-_");
		
		int num1=5;
		int mult;
		
		for(int i=1; i<=10; i++) {
			mult=num1*i;
			
			System.out.println(num1+" x "+i+" = "+mult);
			
		}
		
	}

}

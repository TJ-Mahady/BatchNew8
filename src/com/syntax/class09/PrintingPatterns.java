package com.syntax.class09;

public class PrintingPatterns {

	public static void main(String[] args) {
		
		for (int r=1; r<=4; r++) {
			for (int c=1; c<=6; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
		
		for (int t=0; t<=6; t++) {
			for(int e=1; e<=12; e++) {
				System.out.print("$");
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
		for (int w=1; w<=7; w++) {
			for (int q=1; q<=8; q++){
				System.out.print(q);
			}
			System.out.println();
		}
	}

}

package com.syntax.class04;
//shortcut to import Command+shft+o
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		int num=80;
		String str="i am a String";
		
		Scanner scan=new Scanner(System.in);
		//i'm adding a message to the user
		
		System.out.println("please enter text");
		
		String value=scan.nextLine();//waits for your input and once you provide it, hit enter
		System.out.println("I captured String value ="+value);
	
		System.out.println("Please enter your name");
		String name=scan.nextLine();	
		System.out.println("Nice to meet you"+name);
		
		
		

	}

}

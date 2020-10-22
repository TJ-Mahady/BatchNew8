package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		
		
		Scanner input; 
		String[] names;
		int size;
		
		input=new Scanner(System.in);
		
		System.out.println("How many names would you like to store?");
		
		size=input.nextInt();
		
		
		 names=new String[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Please enter any name");
			names[i]=input.next();
		}
		
		for(int i=0; i<names.length; i++) {
			
			System.out.print(names[i]+" ");
		}
		
	}

}

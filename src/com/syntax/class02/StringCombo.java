package com.syntax.class02;

public class StringCombo {

	public static void main (String[]args) {
		
		String name="Olga";
		
		// I would like to say : My name is Olga
		
		System.out.println("My name is "+name);
		
		String lastName="Sorrels";
		
		System.out.println(name+" "+lastName);
		
		String city="Miami";
		System.out.println(name+" lives in "+city);
		
		char grade='B';
		
		System.out.println(name+" is a "+grade+" "+"student");
		
		int age=21;
		
		System.out.println(name+" is "+age+" years old ");
		
	// to attach/concatenate ANY value (char,int,String,double) to a String, use +
				
		int date= 27; 
		String month="September";
		System.out.println(date+" "+month);
		
		// String state="DC";
		// String anotherState="DC ";
		// ^^ Strings are not equal, the "space" changed it. 
		
		
		
		
		
	}
}

package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		double d=12/7;
		System.out.println(d);
		
		double e=9; //widening
	    System.out.println(e);
		
		
	    
	    //Casting in Java--> converting 1 type to another
	    
	    //two types of casting
	    
	    //widening - implicit (automatic)
	    	//byte->short->int->long->float->double
	    	//easy for compiler to accomplish
	    
	    //narrowing - explicit (manual)
	    	//double->float->long->int->short->byte
	    
	    
	    int i=(int)9.99; //narrowing
	    System.out.println(i);
	    
	    byte b=(byte)130;
	    System.out.println(b);
	    
	    
		
	}

}

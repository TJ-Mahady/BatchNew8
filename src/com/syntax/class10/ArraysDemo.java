package com.syntax.class10;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] grades=new int[5];
		
		grades[0]=98;
		grades[1]=80;
		grades[2]=89;
		grades[3]=67;
		grades[4]=77;
		
		int average=(grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
		
		System.out.println("Average score is= "+average);
		
		System.out.println("------------");
		
		double[] array;
		
		array=new double[4];
		
		array[0]=12.99;
		array[1]=10.89;
		
		System.out.println("Value of last element "+array[2]);
		
		array[2]=5.99;
		System.out.println("Value of last element "+array[2]);
		
		array[3]=7;
		System.out.println("Value of last element "+array[3]);
		
		System.out.println("-------------");
		
		String[] liquid=new String[4];
		
		liquid[0]= "Water";
		
	}

}

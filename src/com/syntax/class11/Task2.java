package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		String [][] array= {
				
				{"Ford", "Chevy", "Tesla"},
				{"VW", "Mercedes", "Porsche"},
				{"Kia", "Hyundai", "Genesis"},
				{"Ferrarri", "Maserati", "BMW"}
				};
		
		for(int i=0; i<array.length; i++) {
			
			for(int j=0; j<array[i].length; j++) {
				
				String car=array[i][j];
				
				System.out.print(car+" ");
			}
		System.out.println();

	}
		
		System.out.println("-----------Another Way-----------");
		
		
		for ( String[] carArray:array) {
			
			for (String car:carArray) {
				System.out.print(car+" ");
			}
			System.out.println();
		}

}
}
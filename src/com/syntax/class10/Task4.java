package com.syntax.class10;

public class Task4 {

	public static void main(String[] args) {
		
		
		String[] cars= {"Porsche", "Hyundai", "Ford", "Chevrolet", "Honda", "Kia"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		
		System.out.println();
		System.out.println("-----------");
		
		
		System.out.println("--------------- Getting values from array using enhanced for loop------------------");
		
		//"car" is the name I gave to the elements within "cars"
		for (String car:cars) {
			System.out.println(car);
		}
		
		System.out.println("-------------------------");
		
		
		//"num" is the name I gave to the elements within "numbers"
		int[] numbers= {10,10,90,600,89};
		
		for(int num :numbers) {
			System.out.println(num);
		}
		
		
		System.out.println("-------------------------");
		
		boolean[] arrayOfBoolean= {true, true, false, false, true, false, true};
		
		for (boolean boo:arrayOfBoolean) {
			System.out.println(boo);
		}

	}

}

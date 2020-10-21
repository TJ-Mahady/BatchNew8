package com.syntax.class09;

public class NesteLoopDemo {

	public static void main(String[] args) {

		for (int h = 0; h < 24; h++) {

			for (int m = 0; m < 60; m++) {

				if (h < 10) {

					if (m < 10) {
						System.out.println("0" + h + ":0" + m);
					} else {
						System.out.println("0" + h + ":" + m);
					}
				} else {
					System.out.println(h + ":" + m);
				}
			}
		}

	}

}

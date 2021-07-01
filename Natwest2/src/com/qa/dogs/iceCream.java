package com.qa.dogs;

public class iceCream {

	public static void whileLoop() {
		int iceCream = 0;
		boolean notEnoughIceCreams = true;
		while (notEnoughIceCreams) {
			System.out.println("have an ice cream");
			iceCream++;
			System.out.println("ice creams =" + iceCream);

			if (iceCream == 10) {
				notEnoughIceCreams = false;

				System.out.println("You've had enough give it a rest");
			}
		}
	}
}

package com.qa.dogs;

public class Dogs {
	public static void whileLoop() {
		System.out.println("while");
		int dogs = 1;
		while (dogs < 2) {
			System.out.println("gimme dog");
			dogs++;
			System.out.println("Dogs = " + dogs);

		}
	}

	public static void doLoop() {
		System.out.println("do while");
		int dogs = 2;
		do {
			System.out.println("gimme dog");
			dogs++;
			System.out.println("dogs =" + dogs);
		} while (dogs < 2);

	}
}
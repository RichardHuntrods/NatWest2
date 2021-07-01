package com.qa.calculator;

public class Calculator {
//	Calculator
//	 1 Create a method that accepts two integers as input, 
//	then returns an integer that is the sum of these two 
//	parameters. (Addition)
//
//	2 Create the following additional three methods that each 
//	take two parameters:
//
//	Multiplication - which takes two numbers and returns the 
//	product.
//	Subtraction - which takes two numbers, then returns the 
//	result of the subtraction.
//	Division - which takes two numbers, then returns the 
//	result of the division.
//	Your division method may have returned the wrong result; 
//	This is called a rounding error and is quite common in most 
//	languages. this is because we were using int's rather than doubles.
//	Modify the division method so that it takes Double parameters and then 
//	return a Double, if not already.
//
	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;

	}

	public static int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	public static double div(double a, double b) {
		double c = 0; // had to put this here because otherwise it was within the brackets. needs to
						// be outside
		if (a < b) { // conditional if A is less than B print otherwise division cant be performed
			c = a / b;
		} else {
			System.out.println("division cannot be performed");
		}
		return c;
	
	}

	// int can't return a decimal so we use a double instead which
	// can accept decimal points.
	// Edit the division method in the Calculator class, the sum
	// should only execute if the first parameter is smaller than the second,
	// otherwise it prints out a message saying that the division cannot be
	// performed.

	// % -modulus divides 2 numbers and gives you the remainder
	// 5%2 -> 1 modulus
	public static int remainder(int a, int b) {

		int c = a % b;
		return c;
	}

	public static int oddEven(int a) {
		int c = a % 2;
		if (a == 0) {
			System.out.println("even");
		} else
			System.out.println("odd");
		return c;
	}

}

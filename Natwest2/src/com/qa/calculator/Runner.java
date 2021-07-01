package com.qa.calculator;

public class Runner {
	
	
	public static void main(String[] args) {
	// main then ctrl + space	
		
	// sysout then ctrl + space	
	System.out.println(Calculator.add(4,11));	
	System.out.println(Calculator.sub(2,8));
	System.out.println("Multiply;" +Calculator.mul(3,10));
	System.out.println("Division;" +Calculator.div(5,10));//This adds division before calculation result
	System.out.println(Calculator.remainder(5,2));
	System.out.println(Calculator.oddEven(5));
	//whenever you do a remainder, conditional change in Calculator class
	//remember to call it in the runner.  In the case of our remainder 
	//odd/even exercise we called the class oddEven so had to set up the 
	//above runner
	
	}
	
}		
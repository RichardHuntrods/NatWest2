package com.qa.exercise;

public class Runner {
	public static void main(String[] args) {
		
		
	Results.totalMarks(100,60,40,120);
	// sysout ctrl+space
	//within brackets () we say what we want to print
	System.out.println(Results.totalMarks(100,60,40,120));
	//"text" = "hi" - > texthi
	
	System.out.println(Results.percent()+ "%");
	System.out.println(3+"%");
	System.out.println(Results.average() + "ave");
	
	System.out.println(Conversion.conversion2(1) + "seconds");
	System.out.println(Conversion.conversion3(1) + "minutes");
	
	
	System.out.println(Calculator.add(10, 5));
	System.out.println(Calculator.subtract(50, 40));
	System.out.println(Calculator.multiply(5, 50));
	System.out.println(Calculator.divide(10, 2));
	}
	

}

package com.qaLoops;

public class Loops {
	
	public static void hello() {
	for (int count =0;count<3; count++) {
		System.out.println("hello");
	}
	}
	
	public static void timesTable(int num) {
	for(int count = 1; count <=10; count++) {
		int out = num * count;
		System.out.println(out);
		
	}	
	}
}

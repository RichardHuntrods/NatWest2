package com.natwest.day2;

public class Conditionals {
	
	public static void temp( int t) {
		//>= greater than and equal too
		//<=less than and equal to
		//> greater than
		//< less than
		//==equal to
		//!= not equal to
		if (t>=30) {
			System.out.println("hot");
		}
		else if(t ==24) {
					System.out.println("Room Temperature - ideal");
		}
					else {
			System.out.println("cold");  
					}}
		
	
	public static void values(int val) {

if (val>50) {
	System.out.println("A");
	
	if (val>75) {
		System.out.println("C");
	}
	else {
		System.out.println("D");
	}

		}else {
			System.out.println("B");
		}

	}}

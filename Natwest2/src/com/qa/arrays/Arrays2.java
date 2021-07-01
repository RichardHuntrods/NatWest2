package com.qa.arrays;

import java.util.ArrayList;

public class Arrays2 {
	public static void arrayList() {

		

		ArrayList<String> cars = new ArrayList<>();
		cars.add("Ford");// index 0
		cars.add("Chevy");// index 1
		cars.add("Honda");// index 2
		cars.add("Ford");
		cars.remove(0);// this will remove the Ford
		//If you then want to remove the Chevy cars.remove(0); 
		//once again
	    //cars.clear(); will clear the full list
	
	
	}
}
package com.qa.exercise;

public class Calculator {

public static int add(int x, int y) {
	int z = x + y;
	return  z;
}

public static int subtract (int x, int y) { 
	int z = x - y;
	return  z;
}
public static int multiply (int x,int y) {
	int z = x*y;
	return z;
}
public static int divide (int x, int y) {
	int z = x/y;
	return z;
	//Calculator Revisited
	//Edit the division method in the 
	//Calculator class, the sum should only 
	//execute if the first parameter is smaller 
	//than the second, otherwise it prints out 
	//a message saying that the division cannot 
	//be performed.
}
}


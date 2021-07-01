package com.qa.oop.polymorphism;

public class Vehicles {

	// variables
	private String reg;
	private int wheels;
	private String models;
	
	//constructor - to set intial values
	public Vehicles(String reg, int wheels, String models) {
		
		this.reg = reg;
		this.wheels = wheels;
		this.models = models;
	}	
// non static method must be called by creating an object/instance of the class
public void brand() {
	System.out.println("ford");
}

	
	}








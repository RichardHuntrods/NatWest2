package com.qa.abstraction;

public abstract class WebPage {
// abstract classes - can have methods with 
//	a body or without a body
	
	
	// home button 
	public void HomeButton( ) {
		System.out.println("HomeButton");
	
}
	
	//layout
	void layout(){//methods with no body
	                         //aka abstract method
	};
	
	//form to submit - fill out details
	abstract void form();
	}













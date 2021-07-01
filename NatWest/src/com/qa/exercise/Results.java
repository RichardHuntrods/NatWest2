package com.qa.exercise;

public class Results {
	
	static int total;

//	A person takes 3 exams in college, Physics, Chemistry, and Biology, 
//	each exam has a maximum of 150 marks. When all the exam marks have been added 
//	together, we can find the overall percentage that the person has got by multiplying their score by 100 and then dividing by 450.
//
//	Create the results class, this class has 5 variables, Physics, Chemistry, 
//	and Biology, total and percentage. This class should also have 2 methods:
//
//	Method 1 - displays the results that the person got for each exam and then the 
//	total mark. Try to make the output neat and bespoke for each exam.
//	Method 2 - which finds and displays the percentage that the person received 
//	for the exams overall.
	
	
	//Task: add another subject, e.g. maths 
	//to the input of the totalMarks method and also 
	//modify the percent method so that it calculates 
	//the percentage total of all the subjects
	
	//public, private, protected, default
	//static 
	//return type -void(returns nothing)int(returns number)String(returns text)
	//Give method a name - camelCase 2nd word is capitalised
	//then give it brackets() - brackets which can have parameters to pass into the method
	//scope represented by { - start of method } - where method ends
	//make sure your RETURN statement is the last part of your method(don't have this for void methods)
	
	
	
	
	public static int totalMarks(int physics, int chemistry, int biology, int maths) {
		 total = physics + chemistry + biology + maths;
		return total;
	}
		
		public static int percent() {
			
	int per = total*100/600;
		if (per>60) {	
	System.out.println("You Have Passed");
		}
	else
		System.out.println("You Have Failed");
			return per;
		}
			
			public static int average() {
				int ave = total/4;
				return ave;
			}
	

}

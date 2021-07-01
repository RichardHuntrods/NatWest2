package com.qa.exceptions;



public class Exceptions {
	
	
		
		public double divide(double firstnumber, double secondnumber) throws ArithmeticException{
			
			if (firstnumber == 0 || secondnumber == 0) {
			//divide by zero exception	
				throw new ArithmeticException("Sorry Can't be divided by zero");
			}
		return firstnumber/secondnumber;
		
		
		}
	
		public void checkNumbers(double firstnumber, double secondnumber) {
		// check if the first number is a valid double number!
			
			try {
			}catch(NumberFormatException e) {
			System.out.println("first number is invalid" + e);
			}finally {
				System.out.println("The Second Number is" + secondnumber);
			}
			
			
			}
		

	
		
}



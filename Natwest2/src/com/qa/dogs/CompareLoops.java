package com.qa.dogs;

public class CompareLoops {
public static void whileLoop() {
int count = 0; 
System.out.println("while loop");
while(count<2) {
	count++;
	System.out.println(count);//does not print


}
}

public static void doWhile() {
int count =0;
System.out.println("do while loop");
do {
	count++;
	System.out.println(count);
}
while(count<2);	

}
}


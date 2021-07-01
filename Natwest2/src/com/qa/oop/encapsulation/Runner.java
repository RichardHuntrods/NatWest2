package com.qa.oop.encapsulation;

public class Runner {
public static void main(String[] args) {
	
ExtremelyImportantStuff PassPortNumber =new ExtremelyImportantStuff(12345678, 81228122, 657.32);	
ExtremelyImportantStuff PassPortNumber2 =new ExtremelyImportantStuff(12349078, 10908122, 879.32);
System.out.println(PassPortNumber2.getAccountNumber());
System.out.println(PassPortNumber2.getBankBalance());
}


}

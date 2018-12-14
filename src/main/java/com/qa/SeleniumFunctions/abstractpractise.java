package com.qa.SeleniumFunctions;
 abstract class pract
  {
	static int var;
	 public static void test() {
		 
		 System.out.println("test");
		 }
	
  }

public class abstractpractise extends pract {

	public static void main(String[] args) {
		
		//abstractpractise as = new abstractpractise();
		pract.var = 10;
		  System.out.println(var);
		 pract.test();

	}

}

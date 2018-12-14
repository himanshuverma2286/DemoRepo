package com.qa.SeleniumFunctions;

import java.io.IOException;

public class practisetrycatch {

	public static void main(String[] args) {
	try {
		test();
	}
	catch (Exception e) {
	  e.printStackTrace();
	  System.out.println("hello");
		System.out.println("Himanshu1");
	}
	}
	
	public static void test() throws ArithmeticException {
		int a=10;
		  int var;	
		 var = a/0;
		 System.out.println("himanshu");
	}

		
	}


/*public static void main(String [ ] args) {
    try{
        System.out.println("1");
        method();
    }
    catch(IOException e) {
        System.out.println("4");
    }
}

public static void method() throws IOException {
    try {
        System.out.println("2");
        throw new IOException();
    }
    catch(IOException e) {
        System.out.println("3");
    }*/

	

	



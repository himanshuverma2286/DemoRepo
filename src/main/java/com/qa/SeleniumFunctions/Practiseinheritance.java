package com.qa.SeleniumFunctions;
class A
{
	public void test()
	{
		System.out.println(" i am in class A");
	}
}
	
public class Practiseinheritance extends A {
	
	public void test()
	
	{
		super.test();
		System.out.println("this is practiseinheritance test method");
	}

	public static void main(String[] args) {
		Practiseinheritance obj = new Practiseinheritance();
		obj.test();
		
		}

}


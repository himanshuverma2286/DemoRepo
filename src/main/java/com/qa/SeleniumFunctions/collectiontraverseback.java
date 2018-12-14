package com.qa.SeleniumFunctions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class collectiontraverseback {

	public static void main(String[] args) {
		ArrayList<Integer> name = new ArrayList<Integer>();
		name.add(12);
		name.add(13);
		name.add(17);
		name.add(18);
		
	//Iterator<Integer> itr =	list.iterator();
		
		ListIterator<Integer> itr = name.listIterator();
	while(itr.hasNext())
	{  
		int a= itr.next();
	    System.out.println(a);
	}
	
	while(itr.hasPrevious()) {
		int b = itr.previous();
		System.out.println(b);
	}
	}

}

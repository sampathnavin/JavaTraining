package day8Polymorphism;

import day9.calMethods;

public class CalMain {

	public static void main(String[] args) {
		
		CalMethods cl = new CalMethods();
		calMethods cq = new calMethods();
		
		//Run Time Polymorphism 
		
		cl.sum(21,22,22,24);
		
		
		// Encapsulation : Binding Methods and Datas
		// How do we use getter and setter method 
		cl.setAccount("awewqqqw");
		System.out.println("The account is" +cl.getAccount());
		 
		
		
		
		

	}

}

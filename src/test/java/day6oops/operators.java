package day6oops;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		
		// % , && , ||
		
		// % Modulus Means - It wil give the reminder of two numbers 
		
		int i = 3 ;
		
		System.out.println(i%2);
		
		// Program to print even numbers 
		// User needs to provide an input 
		
		// Even Numbers - 2/4/6/8/10 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entee the number");
		int j = s.nextInt();
		
		if(j%2==0)
		{
			System.out.println("The number is even" +j);
		}
		else
		{
			System.out.println("The number is odd");
		}
		
		// &&
		
		String s1 = "Java" ;
		
		System.out.println(s1.contains("J"));
		
		System.out.println(s1.contains("a"));
		
		
		if (s1.contains("J")&& s1.contains("a"))
		{
			System.out.println("Valid Validations");
		}
		else
		{
			System.out.println("Not a valid validations");
		}
		
		// Addition
		// Add
		// addition
		
		//Subraction
		//Sub
		//subratcion
		
		// Call the addition methods
		
		// ||
		
		if (s1.contains("J")|| s1.contains("A"))
		{
			System.out.println("Valid Validations");
		}
		else
		{
			System.out.println("Not a valid validations");
		}
		
		
		
		
		

	}

}

package day12ExceptionHandling;

import java.util.Scanner;

public class CalMethods {
	
	
	
	// TRY BLOCK --  IT will Try to execute a method block if it is getting 
	// blocked or an error it will throw an exception 
	
	// CATCH BLOCK -- It will Catch the exception which is thrown by the 
	// try block and it will resume the execution 
	
	//Scanner s = new Scanner(System.in);
	
	public int sum (int p , int y)
	{
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the First Number to add");
			p = s.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Enter the Proper Number" + e);
		}
		try {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the Second Number to add");
			y = s1.nextInt();
		}
		catch(Exception e1)
		{
			System.out.println("Enter the Proper Number" + e1);
		}
		int z = p +y ;
		System.out.println(z);
		return z ;	
	}
	
	public int sub(int a,  int v)
	{
		try
		{
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter the First Number to Subtract");
			a = s2.nextInt();
		}
		catch(Exception e2)
		{
			System.out.println("Enter the Proper Number " +e2);
		}
		
		try 
		{
			Scanner s3 = new Scanner(System.in);
			System.out.println("Enter the Second Number to Subtract");
			v = s3.nextInt();
		}
		catch(Exception navin)
		{
			System.out.println("Enter the Proper Number" +navin);
		}
		int c  = a - v ;
		System.out.println(c);
		return c ;
		
	}

}

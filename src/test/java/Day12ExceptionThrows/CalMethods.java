package Day12ExceptionThrows;


import java.util.Scanner;

public class CalMethods  {
	
	// TRY BLOCK --  IT will Try to execute a method block if it is getting 
	// blocked or an error it will throw an exception 
		
	// CATCH BLOCK -- It will Catch the exception which is thrown by the 
	// try block and it will resume the execution 
		
	//Finally Block -- How ever the codes are running finally block will be executed with the
	// try catch 
	
	// Throw -- User defined Exception 
	
	// Throws -- It will throws an exception it not resume the program
		
		public int sum (int p , int y) throws MatchException
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
			
			finally {
				System.out.println("Hint : You have to enter only numbers Kindly ignore if it is done ");
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
			finally {
				System.out.println("Hint : You have to enter only numbers Kindly ignore if it is done ");
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
			finally {
				System.out.println("Hint : You have to enter only numbers Kindly ignore if it is done ");
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
			finally {
				System.out.println("Hint : You have to enter only numbers Kindly ignore if it is done ");
			}
			int c  = a - v ;
			System.out.println(c);
			return c ;
			
		}
		
		
		// Eg of throwss
		
		public int addi(int d , int v) throws MatchException
		{
			int a ;
			Scanner ss = new Scanner(System.in);
			System.out.println("Enter the Number to add");
			d = ss.nextInt();
			System.out.println("Enter the Number to add");
			v = ss.nextInt();
			a= d + v;
			return a ;
		}


}

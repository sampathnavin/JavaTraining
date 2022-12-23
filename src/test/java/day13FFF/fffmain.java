package day13FFF;

public class fffmain {

	
	// Final Keyword 
	// FInal we cannot override
	// FInal class we cannot inherit the properties 
	
	public static void main(String[] args) {
		
		fff f = new fff();
		f.i = 10;
		
		fff.i = 12 ;
		
		int i = 10;
		
		try
		{
			System.out.println(i%0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Whatever i will execute");
		}
		
		//fff.i = 15 ;
		
		
		//fff o = new fff() ;
		
		//Overriding 
		// o.i = 19 ;

	}

}

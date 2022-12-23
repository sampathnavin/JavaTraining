package day12Exceptions;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		int p = 10 ;
		int z ; 
		
		try 
		{
			System.out.println(p/0);
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
		finally {
			System.out.println("This will be printed");
		}

	}

}

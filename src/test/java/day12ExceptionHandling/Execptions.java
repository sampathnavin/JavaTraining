package day12ExceptionHandling;

public class Execptions {

	public static void main(String[] args) {
		
		int p = 10 ;
		int c = 0 ;
		
		int[] a = new int[10];
		
		a[0] = 12 ;
		a[1] = 13 ;
		
		try {
		System.out.println(a[11]);
		}
		catch(Exception e1)
		{
			System.out.println("Enter the lesser index value" + e1);
		}
		
		
		try {
			System.out.println(p/c);
		}
		catch(Exception e)
		{
			System.out.println("Enter the valid number Ref Dont give 0" +e);
		}
		 // finally , Throw and Throws

	}

}

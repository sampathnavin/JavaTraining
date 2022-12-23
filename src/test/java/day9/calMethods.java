package day9;

public class calMethods {
	
	// Access Modifiers is used to restrict ur code
	
		// Public - It is public accesible to multiple package
		// Default - It is public accesible to multiple package
		// Private - It cannot accesible by other class
		// Final - We cannot override
		// Protected - Within package u can access it Other packages cannot access it 
	
	final int o = 20 ;
	int x = 15 ;
	
	
	public int sum(int i, int j)
	{
		int q = i +j ;
		return q ;
	}
	
	int sum(int i, int j, int r)
	{
		int q = i +j ;
		return q ;
	}
	
	private void out(int i)
	{
		System.out.println("The Input is " +i);
	}
	
	final void p(int y)
	{
		System.out.println("The input" +y);
	}
	
	protected void z(int x, int y )
	{
		System.out.println("Protected");
	}
	

}

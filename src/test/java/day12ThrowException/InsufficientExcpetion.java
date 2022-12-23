package day12ThrowException;

public class InsufficientExcpetion extends Exception {
	

	
	int amount ;
	
	// Constructor Overloading :
	// Passing any arguments with the constructor 
	// are said to be construuctor overloading
	
	public InsufficientExcpetion(int amt)
	{
		amount = amt ;
		System.out.println("Enter less");
	}
	
	

}

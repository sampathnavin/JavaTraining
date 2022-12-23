package day12ThrowException;

import java.util.Scanner;

public class Withdrawl {
	
	
	//Requirement is to create customized  execption 
	// If user withdraw a amount which is greater than ur balance 
	//Throw an error saying Insufficent balance execption
	
	int bal = 1000 ;
	
	public int debit()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Amount to be withdrwl");
		int with = s.nextInt();
		 
		try {
		if(with>bal)
			throw new InsufficientExcpetion(with-bal) ;
		}
		catch(InsufficientExcpetion e)
		{
			System.out.println("Enter the lesser amount" +e);
		}
		
		
		return 0 ;
	}

}

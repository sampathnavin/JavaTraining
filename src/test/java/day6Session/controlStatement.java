package day6Session;

import java.util.Scanner;

public class controlStatement {

	public static void main(String[] args) {
		
		//If else
		
		String name = "Navin Sampath";
		
		if(name.contains("x"))
		{
			System.out.println("It  contains s");
		}
		
		else {
			System.out.println("It does not contains s");
		}
		
		
		// Whether u want add or sub or multiplication or divsion
		
		//add 
		
		// enter the first number
		
		// enter the second number 
		
		//result 
		
		String inp = "Add" ;
		
		Scanner s = new Scanner(System.in);
		
		inp = s.next();
		
		
		inp.equalsIgnoreCase("");
		inp.contains(" ");
		
		if(inp.equals("Add"))
		{
			// enter the first number
			
			// enter the second number 
			
			//result 
			
		}
		
		else if(inp.equals("Sub"))
		{
			// enter the first number
			
						// enter the second number 
						
						//result 
		}
		
		else if(inp.equals("Multi"))
		{
			// enter the first number
			
						// enter the second number 
						
						//result 
		}
		else if(inp.equals("Diviso"))
		{
			
		}
		
		else
		{
			System.out.println("Enter the proper input");
		}

	}

}

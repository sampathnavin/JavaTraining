package day4Session;

public class stringStr {

	public static void main(String[] args) {
		
		
		//String is a series of Character 
		//What is Character ??
		// Characters are a , b , c , d , e .. . . . .. .
		//Combination of all chratcters are said to be a string  eg : abcdefghijkl........
		
		//String is a non primitive data type because string is a class which have many methods (actions) to do 
		//String is immutable in nature  ??? Important interview questions 
		// In string alone there is a concept called String pool which will allocate common memory for common or similar variables 
		// Whatever data's which we are passing through double quotes " " it will consider as String \
		//String pool concept will make the string as immutable 
		
		String FirstName = "Navin";
		String MiddleName = "Kumar" ;
		String LastName = "Sampath" ;
		
		String FullName = null ;
		
		//Concatination meaning adding or clubing two things as one using + keyword 
		
		FullName = FirstName.concat(" " +MiddleName);
		
		FullName = FullName.concat(" "+LastName);
		
		System.out.println(FullName);
		
		
		//Charat (Index)
		System.out.println("The Index of 4 should be " + FullName.charAt(4));
		
		//Substring 
		//Begin Index
		System.out.println(FullName.substring(6));
	
		System.out.println(FullName.substring(0, 19));
		
	}

}

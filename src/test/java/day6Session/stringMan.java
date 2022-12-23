package day6Session;

public class stringMan {

	public static void main(String[] args) {
		
		String name = "This is day 6" ;
		
		System.out.println(name);
		
		//Split it will split the words based on ur input 
		
	String[] title = name.split(" ");
	
	for(String b : title)
	{
		System.out.println(b);
	}
	
	//Contains Methods
	
	System.out.println(name.contains("day"));

	}

}

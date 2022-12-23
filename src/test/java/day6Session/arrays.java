package day6Session;

public class arrays {

	public static void main(String[] args) {
		
		//Why we want to use array  ??
		
		String Name1 = "Akash P U" ;
		String Name2 = "Bhoomika" ;
		String Name3 = "Dhanalskhmi Madhava";
		String Name4 = "Hemanth" ;
		String Name5 = "Ferin" ;
		String Name6 = "Janani" ;
		String Name7 = "Jyoti" ;
		
		String[] students = {"Akash p u" , "Bhoomika" ,"Dhanalskhmi Madhava", "Hemanth" ,"Ferin"  , "Janani" , "Jyoti"} ;
		
		String[] students1 = new String[30];
		students1[0] = "Akash" ;
		students1[1] = "Bhoomika" ;
		
		int[] rollnumber = {1,2,3,4,5,6,7};
		
		String[] mobnumber = {"9741367037", "9845487332"};
		
		//Intilize 
		//Condition
		//Iterate
		
		for(int i = 0; i<students.length; i++)
		{
			System.out.println(students[i]);
		}
		
		//Enhanced For loop 
		for(String s : students)
		{
			System.out.println(s);
		}
		
		for(int p : rollnumber)
		{
			System.out.println(p);
		}
		
		for(String h :mobnumber)
		{
			System.out.println(h);
		}
		
		
		
	}
	
		
		
		
	}




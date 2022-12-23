package day14CollectionsPart2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTopics {

	public static void main(String[] args) {
		
	//Collections ?
	//Why collections part came into picture ?
				
	// Collections - Collections of datas,objects,integer,strings
				
				
				String[] a = new String[5] ;
				a[0] = "Navin" ;
				
				//Array Drawbacks 
				
				// Drawbacks ?
				// Size needs to be declared ??
				// String array if u declare it will accept only strings 
				// Fixed in size 
				
				// Collections will give advantages on the drawbacks on array 
				
				// Dyanamically the size will be increased 
				// It can accepts any data types 
				// Even u can strict ur data types entry 
				
				// Iterator,COLLECTIONS,LIST,SET ,QUEU
				
				
				// To create an array list
				// It is index bases starts from 0
				// It will maintain insertion order
				
				ArrayList students = new ArrayList();
				
		
				// Restricting the collection 
				
				ArrayList<String> mailid  = new ArrayList<String>();
				
				// emailid.add(122);
				
				
				LinkedList students1 = new LinkedList();
				
				students1.add("Navin Sampath");
				students1.add("Akash");
				students1.add("Boomika");
				students1.add("Dhanalakshmi");
				students1.add("Ferin");
				students1.add("Hemanth");
				students1.add("Janani");
				students1.add("Jyoti");
				
				
				for(Object a1: students1)
				{
					System.out.println(a1);
				}
				
				System.out.println("********");
				
				
				for(int i = 0 ; i<students1.size();i++)
				{
					System.out.println(students1.get(i));
				}
				
				
				
				
				
				for(Object b :students )
				{
					System.out.println(b);
				}
				
				for( String c : mailid)
				{
					System.out.println(c);
				}
				
				
				
			
				students.add("Akash");
				students.add("Boomika");
				students.add("Dhanalakshmi");
				students.add("Ferin");
				students.add("Hemanth");
				students.add("Janani");
				students.add("Jyoti");
				students.add("Kalishwri");
				students.add("Leena");
				students.add("Malathi");
				students.add("Muthu Karthika");
				students.add("Raghul");
				students.add("Richard");
				students.add("Sugadarshini");
				students.add("Sindhu");
				students.add("Supraja");
				
				// To get the datas using index
				System.out.println(students.get(3));
				
				// Dynamically add using index
				
				students.add(3, "Navin Sampath");
				System.out.println(students.get(3));
				System.out.println(students.get(4));
				
				System.out.println(students.size());
				
				System.out.println(students.contains("Raghul"));
			
				
				
				
		
				

		

	}

}

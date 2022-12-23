package day13collectionspart1;

import java.util.ArrayList;

public class CollectiosnPart1 {

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
		
		ArrayList id = new ArrayList();
		
		// id.add(1);
		
		
		for(int i = 1 ; i <=students.size(); i++)
		{
			id.add(i);
		}
		
		for(int j = 0 ; j <students.size(); j++)
		{
			for(int p = 0 ; p <id.size(); p++)
			{
				System.out.println("The id for" + " " +id.get(p) + "is"+students.get(j) );
			}
		}
		
		

		
		System.out.println(id.size());
		
		
		
		
		
		
		
	}

}

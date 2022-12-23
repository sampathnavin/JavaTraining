package Day15CollectionsPart2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class SetInterfaces {

	public static void main(String[] args) {
	
		
		// Set is an interface which implemets Collection Interface 
		
		// Hashset and Linked HashSet (Classes)
		
		// What are the advantages of Set ? // Why Set has been Developed ??
		
		// Set will not allow u duplicate values
		
		// HashSet // Duplicates are not allowed 
		// Insertion order is not maintained 
		// HashTable Data structure 
		
		// HashSet
		// <>
		
		HashSet h = new HashSet();
	
		h.add("Java");
		h.add("Selenium");
		h.add("Java");
		
		System.out.println(h.contains("Java"));
		
	
		for(Object e : h)
		{
			System.out.println(e);
		}
		
		HashSet h1 = new HashSet();
		
		
		// Pass ur old collection which u wanna copy using add all methods
		
		h1.addAll(h);
		
		for(Object h2: h1)
		{
			System.out.println(h2);
		}
		
		
		System.out.println(h1.size());
		
		HashSet<String> h3 = new HashSet<String>();
		
		h3.add("Java");
		h3.add("Java");
		h3.add("Selenium");
		h3.add("Python");
		h3.add("JAR FILES");
		h3.add("Strings");
		h3.add("Arrays");
	
		
		// Insertion order
		
		// it will not give .get methods 
		
		
		// LinkedHashset 
		
		// Duplicates are not allowed 
		// Hash table and Linked hashSet Data Structures combinely it will work to increase the perfromanace 
		// u can user defined 
		
		LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();
		
		/*link.add("Integer");
		link.add("String");*/
		link.add(1234);
		link.add(12);
		link.add(0000);
		/*link.add('c');
		link.add(true);*/
		
		for(int a: link)
		{
			System.out.println(a);
		}
		
		
		System.out.println(link.size());
		
	//	link.clear();
		
		System.out.println("*********");
		
		System.out.println(link.size());
		
		
		
		// Iterator 
		
		// Parent Interface for Collections
		// Iteration one by one gettting objects 
		// Iterator Interface 
		//  We are not creating an object for Iterator Interface 
		// Refrencing the interface 
		
		Iterator i = link.iterator();
		
		
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
	}


		
}
package Day16MapInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapInterfacesHashMapLinkedHashMap {

	public static void main(String[] args) {
		
		// Map 
		
		// Why ? - Map Interface will save the objects or datas in key and value pairs
		
		// How we can save marks and subjects ?? in java 
		
		ArrayList marks = new ArrayList();
		ArrayList Subject = new ArrayList();
		
		Subject.add("Science");
		Subject.add("Social");
		Subject.add("Maths");
		Subject.add("Tamil");
		Subject.add("Hindi");
		Subject.add("French");
		

		marks.add(90);
		marks.add(90);
		marks.add(90);
		marks.add(90);
		marks.add(90);
		marks.add(90);
		marks.add(90);
		
		// Map - To store values in keys and values format 
		// inSertion order is not maintained
		// Keys cannot be duplicate 
		// Values can be duplicate 
		
	
		HashMap mp = new HashMap();
		mp.put("Science", 90);
		mp.put("Social", 85);
		mp.put("French", 85);
		mp.put("English", 76);
		mp.put("Tamil", 90);
		
		//Userdefined Hash Map 
		HashMap<Integer, Integer> o = new HashMap<Integer, Integer>();
		
		
		System.out.println(mp.get("French"));

		// Iterate Map i need both Keys and Values 
		
		// Marks scored in so and so subject is ----
		
		for(Object i : mp.keySet())
		{
			System.out.println("Marks Scored in" + " " + i + "is" + mp.get(i));
		}
		
		
		LinkedHashMap mp1 = new LinkedHashMap() ;
		LinkedHashMap<String, String> mp2 = new LinkedHashMap<String, String>();
	
		
		mp1.put(1, "S");
		
		
	}
	

}

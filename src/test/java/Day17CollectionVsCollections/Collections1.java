package Day17CollectionVsCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Collections1 {

	public static void main(String[] args) {
		
		// Collection is a interface 
		// Collections is a class inside java
		
		ArrayList mark = new ArrayList();
		
		// Marks as 90 70 80 
		
		mark.add(90);
		mark.add(80);
		mark.add(70);
		mark.add(60);
		mark.add(106);
		
		
		// Collections Class is used to do modifications or manipiulations with Colelction 
		
		//Collections.sort(mark);

		for(Object b1 : mark) {
			System.out.println(b1);
		}
		
		Collections.reverse(mark);
		
		
		for(Object b : mark) {
			System.out.println(b);
		}
		
		
		
		
		
		
		

	}

}

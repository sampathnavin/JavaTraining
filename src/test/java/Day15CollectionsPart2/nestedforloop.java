package Day15CollectionsPart2;

import java.util.ArrayList;

public class nestedforloop {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> n = new ArrayList<Integer>();
		//ArrayList<Integer> n1 = new ArrayList<Integer>();
		
		
		for(int i = 1 ; i <=10 ; i++)
		{
			n.add(i);
		}
		
		
		
		for(int p = 0 ; p<n.size(); p ++)
		{
			for(int y = 1; p<n.size(); y++)
			{
				System.out.println(p);
			}
		}
		
		
		
		
	}

}

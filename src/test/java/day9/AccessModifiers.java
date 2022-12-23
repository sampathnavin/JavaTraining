package day9;

public class AccessModifiers {

	public static void main(String[] args) {
		
		calMethods cl = new calMethods();
		
		cl.sum(3, 2);
	
		cl.z(12, 21);
		System.out.println("The Output before overriding is "  +cl.x);
		//cl.o = 15 ;
		cl.x = 30 ;
		System.out.println("The Output After overriding is "  +cl.x);
	
		
		
		
		
		
		
		
		
		
	}

}

package day13FFF;

public class day14FInalizeconcept {

	
	// Finalize :
	
	//  To delete or free up the memory of the unwanted object refrences
	// which is created or decomisioned or not being refered finalize method
	// wil be called before java is calling garbage collector method 
	
	
	public static void main(String[] args) {
		
		day14Finalize d = new day14Finalize();
		
		d = null ;
		
		System.gc();

	}

}

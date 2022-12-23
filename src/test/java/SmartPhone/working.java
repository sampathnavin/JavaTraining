package SmartPhone;

public class working {

	public static void main(String[] args) {
		
		iphone ip = new iphone();
		ip.switchoff();
		
		//While compiling only java compiler knows which methods to be called
		//Static or compile time polymorphism 
		//Overriding 
		ip.switchon();
		
		System.out.println("**************");
		
		samsung sm = new samsung();
		sm.switchoff();
		sm.switchon();
		
		
	}

}

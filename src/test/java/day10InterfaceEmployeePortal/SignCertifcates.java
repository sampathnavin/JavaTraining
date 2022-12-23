package day10InterfaceEmployeePortal;

public class SignCertifcates implements OfficeRules, CafetariaRules {

	
	// Method are overriden 
	
	public void productDamage() {
		
		System.out.println("You have signed for Dont Break Any Products Which will Cause Violation");
		
	}

	public void maintainque() {
		System.out.println("You have signed for Maintain Proper Lines while getting Food");
		
	}

	public void liftrules() {
		
		System.out.println("You have signed for Maintaing Lift rules ony 10 People are allowed");
		
	}

	public void OfficeTimings() {
		
System.out.println("You have signed for maintaining 9 hrs work timing");
		
	}

	public void worklogs() {
		
System.out.println("You have signed for updating day to day work to ur manager");
	}

	public void dressCode() {
		
		System.out.println("You have signed for maintaing proper dress code");
		
	}

	public void wearid() {
		
	System.out.println("You have signed for wearing ID card always");
		
	}
	

}

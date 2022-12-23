package day10InterfaceEmployeePortal;

public interface OfficeRules {
	
	// Multiple inheritance can be achieved here using interface 
	//  We will using Implemets keywords  // Important interview questions
	// Whatever methods u guys are creating right it will be always abstract 
	// No Need to give abstract keyword
	//  We cannot create objects for interface
	// If you are creating a varaible inside ur interface it wil be alwyas 
    // Final and static in nature
	//  100 % Abstarction is applied here
	// It will not allow u to create a method implemenation 
	
	public void OfficeTimings();
	public void worklogs() ;
	public void dressCode();
	public void wearid();
	int i = 15 ; // Variables are considered as final keyword
	
	

}

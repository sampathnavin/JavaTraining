package day10NewJoinersEmployePortal;

public abstract class OfficeRules {
	
	// Multiple Inheritance is not applicable to java
	// Java is giving u a short cut or an another way to achieve 
	// Multiple inheritance using Interface/Abstraction 
	// implements 
	// Interface it will allow u to write the method
		
	
	// Abstraction it will allow the implementation part also it should be non abstarct methods
	// Abstraction will allow you do create a dummy methods also without implementation
	// Abstarct keyword is needed if you are creating any one abstarct method also 
	// It will also allow non abstarct methods also 
	// 100% abstarction is getting failed so we are moving to interface
	// U cannot create a object 
	
	public abstract void Officetiimgs();
	
	public void wearId()
	{
		System.out.println("Waear ID CARD ALWAYS");
	}
	
	public abstract void dressCode() ;
	
	public abstract void workLogs() ;
	
	
	
	
	
	
	
	
	

}

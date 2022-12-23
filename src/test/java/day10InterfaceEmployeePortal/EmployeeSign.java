package day10InterfaceEmployeePortal;

public class EmployeeSign {

	public static void main(String[] args) {
		
		// We cannot able to create object for interface or abstratc class
		
		// OfficeRules o = new OfficeRules(); 
		
		SignCertifcates s = new SignCertifcates();
		s.dressCode();
		s.wearid();
		s.OfficeTimings();
		s.productDamage();
		s.worklogs();
		s.maintainque();
		s.liftrules();
		

	}

}

package dayFour;

public class strName {

	public static void main(String[] args) {
		
		
	
		String Name = "Navin" ;
		String MiddleName = "Kumar" ;
		String lastname = "Sampath";
		
		// String Is immutable in Nature
		
		//Using string and its methods we can do multiple manipulations 
		
		// What ever we give in double quotes it will take as String 
		
		// It will not create multiple memories // Storage of memory will be reduce 
		
		//performance will be high 
		
		// String will not assign on its own ww have to assign the datas as it is imuutable 
		
		
		
		String a = null ;
		
		System.out.println("The STarting point is here" + a);
		
		a = Name.concat(" " +MiddleName);
		
		System.out.println("We are adding middle name" + a);
		
		
		String Fullname = a;
		
		a = a.concat(" "+lastname);
		System.out.println("My last name is" +" "+a);
		
		System.out.println(a);
		
		System.out.println(a.charAt(10));
		System.out.println(a.charAt(11));
		
		String substrinn = a.substring(0, 6);
		System.out.println(substrinn);
		
		
		String substrinn2 = a.substring(12, 19);
		
		String substrinn3 = a.substring(12);
		
		System.out.println("Substring2" +substrinn2);

		System.out.println(substrinn3);
		
		
		
		
		
		
		
		
		

	}

}

package day8Polymorphism;

public class CalMethods {
	
	//Encapsulation ??
	
		// Binding datas and methods
		// Hiding Datas 
		// Protecting Datas // Securites is incre 
		// Encapsulation can be achieved by settiing a variabe in Private 
		// Encapsulation can be achieved using getter and setter method
		
		private String account ;
		
		private String GSTno ;
		
		private String phonenumber ;
		
		
		public String getAccount() {
			return account;
		}

		public void setAccount(String account) {
			this.account = account;
		}

		public String getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
	
		
		
		
	
	//Polymorphism : One to many methods 
	
	// Polymorphism is divided into two types 
	
	// Static - Compile Time Polymorphism  - Method over riding
	
	//Dynamic - Run time Polymorphism 
	
	
	//Dynamic - Run time Polymorphism - Method over loading 
	
	// Methods with same name but different arguments are called as method overloading
	
	

	

	public int sum(int i , int j)
	{
		int z = i + j;
		return z ;
	}
	
	public int sum(int p , int t , int s)
	{
		int l = p+t+s;
		return l ;
	}
	
	public int sum(int d , int f , int h, int n)
	{
		int x = d+f+h+n;
		return x ;
	}
	
	
	

}



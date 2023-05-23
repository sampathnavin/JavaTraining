package EnumClass;

public class CallUserEnum {
	static void display()
	{
		String s=User.FOUR.password;
		User user[]=User.values();
		for(User username : user)
		{
			System.out.println(username.username+ " : "+username.password);
		}
	}
	public static void main(String[] args) {
		display();
	}

}

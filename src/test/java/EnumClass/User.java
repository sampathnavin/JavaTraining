package EnumClass;

public enum User {
	
	ONE("standard_user","secret_sauce"),
	TWO("locked_out_user","secret_sauce"),
	THREE("problem_user","secret_sauce"),
	FOUR("performance_glitch_user","secret_sauce");
	
	final String username,password;
	User(String username,String password)
	{
		this.username=username;
		this.password=password;
	}

}

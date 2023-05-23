package EnumClass;

public class EnumMain {
	public static void main(String[] args) {
		WeekDays s=WeekDays.Friday;
		WeekDays days[]=WeekDays.values();
		for(WeekDays day :days )
		{
			
			if (day.toString().equals("Sunday"))
				System.out.println("Sunday");
			else if (day.toString().equals("Monday"))
				System.out.println("Monday");
			else if (day.toString().equals("Tuesday"))
				System.out.println("Tuesday");
			else if (day.toString().equals("Wednesday"))
				System.out.println("Wednesday");
			else if (day.toString().equals("Thursday"))
				System.out.println("Thursday");
			else if (day.toString().equals("Friday"))
				System.out.println("Friday");
			else
				System.out.println("Saturday");
		}
	}

}

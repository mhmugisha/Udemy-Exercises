package exercises;

public class MinutesToYearsAndDays {

	public static void main(String[] args) {
		printYearsAndDays(1440);

	}

	public static void printYearsAndDays(long minutes) {
	if(minutes < 0)
		System.out.println("Invalid Value");
	
	else {
		long years =minutes/(24*60*365);
		long days = (minutes/(24*60))%365;
	
	System.out.println(minutes + " min = " + years + " y and " + days + " d");
	}
	}
}

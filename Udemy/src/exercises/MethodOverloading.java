package exercises;

public class MethodOverloading {

	public static void main(String[] args) {
		calcFeetAndInchesToCentimeters(6, 0);

	}
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if(feet < 0|| inches < 0 || inches > 12) {
			System.out.println("Invalid feet or inches!");
			return -1;
		}
		
		double centimeters = (inches + feet*12)*2.54;
		
		System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm");
		return centimeters;
		
		
		
	}

}

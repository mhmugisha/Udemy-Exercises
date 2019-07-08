package exercises;

public class AreaCalculator {

	public static void main(String[] arg) {
		area(-5.0);
		area(5,6);

	}
	
	public static double area(double radius) {
		if(radius < 0) 
			return -1;
		
		
		double area = radius*radius*Math.PI;
		System.out.println(area);
		return area;
	}
	
	public static double area(double x, double y) {
		if(x<0||y<0||(x<0&&y<0))
			return -1;
		
		double area = x*y;
		System.out.println(area);
		return area;
		
	}
	
	
	
}

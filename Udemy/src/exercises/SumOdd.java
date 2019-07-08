package exercises;

public class SumOdd {

	public static void main(String[] arg) {
		
		System.out.println(isOdd(1112560));
		System.out.println(sumOdd(3,3));

	}
	
	public static boolean isOdd(int number) {
		if(number <=0)
			return false;
		else if(number%2!=0)
			return true;
		return false;
	}
	
	public static int sumOdd(int start, int end) {
	if(start>end||start<=0||end<=0)
		return -1;
	
	int sum = 0;
	for(int i=start; i<=end; i++) {
		if(isOdd(i))
			sum += i;
	}
	return sum;
	
		
	}
	
}

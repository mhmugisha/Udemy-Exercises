package exercises;

public class ReverseNumberWhile {
	
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(13));
	}
	
	public static int sumFirstAndLastDigit( int Number ) {
		int Reverse = 0;
		int Remainder = 0;
		int temp = Number%10; 
		
		while (Number  > 0&& Number <10) {
		Remainder = Number % 10;
		Reverse = Reverse*10 + Remainder;
		Number = Number / 10;
	}
	
	return temp + Number;
	}
	
	
}

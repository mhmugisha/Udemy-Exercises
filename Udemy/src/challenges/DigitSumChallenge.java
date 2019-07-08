package challenges;

public class DigitSumChallenge {

	public static void main(String[] args) {
		System.out.println("Sum of the digits in no. is: "+ sumDigits(88));
	}
	
	public static int sumDigits(int number) {
		if(number<10) {
			return -1;
		}
		
		int sum = 0;
		while(number>0) {
			//Extract least significant no. 
			int digit = 0;
			digit = number % 10;
			sum += digit;
			
			//Drop last number - by integer division
			number /= 10; //or number = number/10; 
		}
		return sum;
	} 
}

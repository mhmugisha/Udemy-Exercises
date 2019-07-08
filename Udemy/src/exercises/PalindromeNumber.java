package exercises;

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println(isPalindrome(1234321));

	}

	public static boolean isPalindrome(int number) {

		int reverse = 0;

		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;

			
		}
		
		

		return false;

	}
}

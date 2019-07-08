package exercises;

public class LastDigitChecker {

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(900, 350, 654));
	}

	public static boolean hasSameLastDigit(int one, int two, int three) {
		if ((one < 10 || one > 1000) || (two < 10 || two > 1000) || (three < 10 || three > 1000))
			return false;
		else if ((one % 10 != two % 10) && (one % 10 != three % 10) && (two % 10 != three % 10))
			return false;
		else if ((one % 10 == two % 10) || (one % 10 == three % 10) || (two % 10 == three % 10))
			return true;
		else
			return false;

	}
	
	public static boolean isValid(int num) {
		if(num<10||num>1000)
			return false;
		return true;
	}

}

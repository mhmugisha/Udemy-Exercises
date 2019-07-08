package exercises;

public class TeenNumberChecker {

	public static void main(String[] args) {

		System.out.println(hasTeen(13,5,20));
		System.out.println(isTeen(10));
		
	}

	public static boolean hasTeen(int one, int two, int three) {
		if (one >= 13 && one <= 19)
			return true;
				
			else if (two >= 13 && two <= 19)
				return true;
		
				else if (three >= 13 && three <= 19)
					return true;

			return false;
	}

	public static boolean isTeen(int one) {
		if(one >=13 && one <= 19)
			return true;
		return false;
	}
	
	
}

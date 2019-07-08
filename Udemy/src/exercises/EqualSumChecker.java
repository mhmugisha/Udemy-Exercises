package exercises;

public class EqualSumChecker {

	public static void main(String[] args) {
		System.out.println(hasEqualSum(1,1,5));
		

	}

	public static boolean hasEqualSum(int one, int two, int three) {
		if(one+two==three)
			return true;
		return false;
	}
	
}

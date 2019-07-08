package exercises;

public class SharedDigit {

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(15, 55));
	}

	public static boolean hasSharedDigit(int one, int two) {
		if ((one < 10 || one > 99) || (two < 10 || two > 99))
		{
			return false;
		}
		
		else if(one%10==two%10)
			return true;
		else if(one%10==two/10)
			return true;
		else if(one/10==two/10)
			return true;
		else if(one/10==two%10)
			return true;
		else
			return false;	
	}
}

package exercises;

public class EqualityPrinter {

	public static void main(String[] args) {
		printEqual(1,4,5);
	}
	
	public static void printEqual(int one, int two, int three) {
		if(one<0||two<0||three<0)
			System.out.println("Invalid Value");
		
		else if (one==two&&two==three)
			System.out.println("All numbers are equal");
		
		else if(one!=two && one!=three && two!= three)
			System.out.println("All numbers are different");
		
		else
			System.out.println("Neither all are equal or different");
			
			
	}

}

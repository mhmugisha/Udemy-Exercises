package exercises;

public class Exercise1 {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(-1002001);

	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes < 0)
			System.out.println("Invalid Value");
		else
			System.out.println(kiloBytes + " KB = " + kiloBytes / 1024 + 
									" MB and " + kiloBytes % 1024 + " KB");
	}

}


public class IntEqualityPrinter {

	public static void main(String[] args) {
		printEqual(1, 2, 3);
	}

	public static void printEqual(int i, int j, int k) {
		if(i > 0 && j > 0 && k > 0) {
		if (i == j && j == k) {
			System.out.println("All numbers are equal");
		} else if ((i == j) || (i == k) || (j == k)) {
			System.out.println("Niether all are equal or different");
		} else {
			System.out.println("All numbers are different");

		}
	}else {
		System.out.println("Invalid Value");
	}
	}
}


public class LargestPrime {

	public static void main(String[] args) {
		System.out.println(getLargestPrime(0));
	}

	private static int getLargestPrime(int number) {

		int count = 0, primeFactor = 0;
		if (number <= 1) {
			return -1;
		} else {
			for (int i = 2; i <= number; i++) {
				if (number % i == 0) {
					for (int j = 2; j <= i; j++) {
						if (i % j == 0) {
							count++;
						}
					}
					if (count == 1) {
						if (primeFactor < i) {
							primeFactor = i;
						}
					}
					count = 0;
				}
			}
			return primeFactor;
		}
	}
}

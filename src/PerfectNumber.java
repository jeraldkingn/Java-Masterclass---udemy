
public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println(isPerfectNumber(10));
	}

	public static boolean isPerfectNumber(int number) {
		if (number > 0) {
			int sum = 0;

			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					sum += i;
					System.out.println("i ==> " + i);
					System.out.println(sum);
					if (sum == number) {
						return true;
					}
				}
			}
			return false;
		} else {
			return false;
		}
	}
}

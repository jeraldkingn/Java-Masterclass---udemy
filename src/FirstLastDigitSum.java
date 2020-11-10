
public class FirstLastDigitSum {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(199));
	}

	public static int sumFirstAndLastDigit(int number) {
		if (number > 0) {
			int firstNumber = number;
			int lastNumber = number % 10;

			while (firstNumber >= 10) {
				firstNumber /= 10;
			}

			int total = firstNumber + lastNumber;
			return total;
		} else {
			return -1;
		}
	}

}

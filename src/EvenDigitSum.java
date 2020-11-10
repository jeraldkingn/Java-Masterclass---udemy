
public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
	}

	public static int getEvenDigitSum(int number) {
		if (number > 0) {
			int total = 0;
			while (number > 0) {
				//System.out.println(number);
				
				int isEven = number % 10;
				if (isEven % 2 == 0) {
					total += isEven;
				}
				number = number/10;
			}

			return total;
		} else {
			return -1;
		}
	}
}


public class SharedDigit {

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(71, 21));
	}

	public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

		if (firstNumber > 9 && firstNumber < 100 && secondNumber > 9 && secondNumber < 100) {
			
			String firstNumberInString = Integer.toString(firstNumber);
			while (secondNumber > 0) {
				int lastNumber = secondNumber % 10;
				String lastNumberInString = Integer.toString(lastNumber);
				if ((firstNumberInString.contains(lastNumberInString)) == true) {
					return true;
				}
				secondNumber /= 10;
			}
			return false;

		}else {
			return false;
		}
	}
}

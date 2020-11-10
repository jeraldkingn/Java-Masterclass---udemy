
public class LastDigitChecker {

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(11, 20, 83));
		isValid(1);
	}

	public static boolean isValid(int i) {
		if(i > 9 && i < 100 ) {
			return true;
		}else {
			return false;
		}
		
	}

	public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
		
		if(isValid(firstNumber) == true && isValid(secondNumber)== true && isValid(thirdNumber) == true) {
			int firstNumberLastDigit = firstNumber % 10;
			int secondNumberLastDigit = secondNumber % 10;
			int thirdNumberLastDigit = thirdNumber % 10;
			if(firstNumberLastDigit == secondNumberLastDigit || secondNumberLastDigit == thirdNumberLastDigit
				|| thirdNumberLastDigit == firstNumberLastDigit){
					return true;
				}else {
					return false;
				}
		}else {
			return false;
		}

	}

}

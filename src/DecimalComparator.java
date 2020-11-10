
public class DecimalComparator {
	public static void main(String[] args) {
		boolean output = areEqualByThreeDecimalPlaces(12.31,12.3);
		System.out.println(output);
	}

	private static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
		double number1val = ((long)(number1 * 1e3)) / 1e3;
		double number2val = ((long)(number2 * 1e3)) / 1e3;
		
		if(number1val == number2val) {
			return true;
		}else {
			return false;
		}
	}

}

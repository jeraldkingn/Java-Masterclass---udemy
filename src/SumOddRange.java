
public class SumOddRange {

	public static void main(String[] args) {
		int output = sumOdd(1,11);
		System.out.println(output);
	}

		public static int sumOdd(int start, int end) {
			int sum = 0;
			if (start > 0 && end > 0 && start <= end) {
				for (int i = start; i <= end; i++) {
					if (isOdd(i) == true) {
						sum += i;			
					}
				}
				return sum;
			}else {
				return -1;
			}
		}
	
		public static boolean isOdd(int number) {
			if (number > 0) {
				if (number % 2 != 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}

}

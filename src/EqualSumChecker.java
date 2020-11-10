
public class EqualSumChecker {
	public static void main(String[] args) {
		boolean output = hasEqualSum(1, 2, 3);
		System.out.println(output);
	}

	public static boolean hasEqualSum(int i, int j, int k) {
		if( i + j == k) {
			return true;
		}else {
			return false;
		}
	}

}

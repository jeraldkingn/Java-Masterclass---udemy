
public class TeenNumberchecker {
	public static void main(String[] args) {
		boolean output = hasTeen(1, 2, 3);
		System.out.println(output);
	}
	
	public static boolean isTeen(int i) {
		if(i > 12 && i < 20 ) {
			return true;
		}else
			return false;
	}
	
	public static boolean hasTeen(int i, int j, int k) {
			if(isTeen(i) == true || isTeen(j) == true || isTeen(k) == true) {
				return true;
			}
			else {
				return false;
			}
	}
}

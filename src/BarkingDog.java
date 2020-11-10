
public class BarkingDog {
	public static void main(String[] args) {
		boolean result = shouldWakeUp(true, 4);
		System.out.println(result);
	}

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (hourOfDay >= 0 && hourOfDay < 24 && barking == true) {
			if (hourOfDay < 8 && hourOfDay < 22) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}

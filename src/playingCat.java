
public class playingCat {

	public static void main(String[] args) {
		boolean output = isCatPlaying(true, 45);
		System.out.println(output);
	}

	public static boolean isCatPlaying(boolean summer, int temperature) {
		if (summer == true) {
			if (temperature >= 25 && temperature <= 45) {
				return true;
			} else {
				return false;
			}
		} else {
			if (temperature >= 25 && temperature <= 35) {
				return true;
			} else {
				return false;
			}
		}
	}

}

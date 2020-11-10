public class SpeedConverter {
	public static void main(String[] args) {
		printConversion(0.0);
		long output = toMilesPerHour(1.25);
		System.out.println(output);
	}

	public static void printConversion(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			long output = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + " km/h = " + output + " mi/h");
		}
	}

	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			return -1;
		} else {
			return Math.round(kilometersPerHour / 1.609);
		}
	}
}

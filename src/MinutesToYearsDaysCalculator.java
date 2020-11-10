
public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		printYearsAndDays(561600);
	}

	public static void printYearsAndDays(long minutes) {
		{
			if (minutes > 0) {
				long days1 = minutes / 1440;
				long years = days1 / 365;
				long days = days1 % 365;
				
				System.out.println(minutes + " min = " + years + " y and " + days + " d");

			} else {
				System.out.println("Invalid Value");
			}
		}
	}


}


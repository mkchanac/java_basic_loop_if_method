
public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1hr=60mins, 1day=24hrs, 1yr=365days
		printYearsAndDays(561600);
	}
	public static void printYearsAndDays(long minutes) {
		if(minutes<0) {
			System.out.println("Invalid Value");
		}
		else {
			long hr, day, year;
			hr = minutes / 60;
			day = hr / 24;
			hr = hr % 24;
			year = day / 365;
			day = day % 365;
			System.out.println(minutes + " min = " + year + " y and " + day + " d");
		}
	}
}


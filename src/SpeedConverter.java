
public class SpeedConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long milesPerHour;
////		milesPerHour = toMilesPerHour(75.114);
////		System.out.println(milesPerHour);
//		printConversion(75.1114);

	}
	public static long toMilesPerHour (double kilometersPerHour) {
		//1mile per hour = 1.609 kilometers per hour
		long milesPerHour;
		if (kilometersPerHour >= 0) {
		milesPerHour = (long) Math.round((kilometersPerHour)/1.609);
		}
		else {
			milesPerHour = -1;
		}
			
		return milesPerHour;
	}
	public static void printConversion (double kilometersPerHour) {
		if(kilometersPerHour >=0) {
		long milesPerHour = toMilesPerHour(kilometersPerHour);
		System.out.println( kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
		}
		else {
			System.out.println("Invalid Value");
		}
	}

}

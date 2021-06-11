
public class DecimalComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;
		result = areEqualByThreeDecimalPlaces(-3.1756,-3.175);
		System.out.println(result);
		result = areEqualByThreeDecimalPlaces(3.175,3.176);
		System.out.println(result);
		result = areEqualByThreeDecimalPlaces(3.0,3.0);
		System.out.println(result);
		result = areEqualByThreeDecimalPlaces(-3.123,3.123);
		System.out.println(result);

	}
	public static boolean areEqualByThreeDecimalPlaces(double var1, double var2) {
		int round1, round2;
		round1 = (int) (var1 * 1000);
		round2 = (int) (var2 * 1000);
		if(round1==round2) {
			return true;
		}
		else {
			return false;
		}
	}

}

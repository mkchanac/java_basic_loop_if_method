
public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = shouldWakeUp(true,1);
		System.out.println(result);
		result = shouldWakeUp(false,2);
		System.out.println(result);
		result = shouldWakeUp(true,8);
		System.out.println(result);
		result = shouldWakeUp(true,-1);
		System.out.println(result);
	}
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		boolean result;
		if (hourOfDay < 0 || hourOfDay > 23) {
			result = false;
		}
		else if (barking == true && (hourOfDay <8 || hourOfDay>22)) {
			result = true;
		}
		else
			result = false;
		return result;
	}

}

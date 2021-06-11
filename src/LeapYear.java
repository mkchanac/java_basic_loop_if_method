
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;
		result = isLeapYear(-1600);
		System.out.println(result);
		result = isLeapYear(1600);
		System.out.println(result);
		result = isLeapYear(2017);
		System.out.println(result);
		result = isLeapYear(2000);
		System.out.println(result);
	}
	public static boolean isLeapYear(int year) {
		if(year>=1 && year <=9999) {
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0 ) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return true;
				}
			}
			else {
				return false;
			}
			
			
		}
		
		else {
			return false;
		}
	}

}

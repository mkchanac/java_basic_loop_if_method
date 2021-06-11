
public class NumberOfDaysInMonth {

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
		int day;
		day = getDaysInMonth(1,2020);
		System.out.println(day);
		day = getDaysInMonth(2,2020);
		System.out.println(day);
		day = getDaysInMonth(2,2018);
		System.out.println(day);
		day = getDaysInMonth(-1,2020);
		System.out.println(day);
		day = getDaysInMonth(1,-2020);
		System.out.println(day);
		
	}

	public static boolean isLeapYear(int year) {
		boolean result;
		if (year >= 1 && year <= 9999) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				result = true;
			} else {
				result = false;
			}
		} else {
			return result = false;
		}
		return result;
	}

	public static int getDaysInMonth(int month, int year) {
		int day = 0;
		boolean isLeapYear;
		if (month < 1 || month > 12 || year < 1 || year > 9999) {
			day = -1;
		} else {
			switch (month) {
			case 1:
				day = 31;
				break;
			case 2:
				if (isLeapYear(year)) {
					day = 29;
				} else {
					day = 28;
				}
				break;
			case 3:
				day = 31;
				break;
			case 4:
				day = 30;
				break;
			case 5:
				day = 31;
				break;
			case 6:
				day = 30;
				break;
			case 7:
				day = 31;
				break;
			case 8:
				day = 31;
				break;
			case 9:
				day = 30;
				break;
			case 10:
				day = 31;
				break;
			case 11:
				day = 30;
				break;
			case 12:
				day = 31;
				break;
			}
		}
		return day;

	}

}


public class LastDigitChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSameLastDigit(23, 99, 999));
	}

	public static boolean hasSameLastDigit(int x, int y, int z) {
		if (isValid(x) && isValid(y) && isValid(z)) {
			if (x % 10 == y % 10 || x % 10 == z % 10 || y % 10 == z % 10) {
				return true;
			} else
				return false;
		} else
			return false;
	}

	public static boolean isValid(int number) {
		if (number >= 10 && number <= 1000)
			return true;
		else
			return false;
	}

}

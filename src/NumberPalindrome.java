
public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;
		result = isPalindrome(-1221);
		System.out.println(result);

	}

	public static boolean isPalindrome(int number) {
		int normal = 0;
		int reverse = 0;
		int digit;
		int count = 0;
		int normalN = 0;

		while (number > 0) {
			normal += number % 10 * Math.pow(10, count);
			number = number / 10;
			count++;
		}
		
		int lastDigit = normal;
		
		for (int i = count - 1; i >= 0; i--) {
			reverse += (normal % 10 * Math.pow(10, i));
			normal = normal / 10;
		}

		if (reverse == lastDigit) {
			return true;
		} else
			return false;

	}

}

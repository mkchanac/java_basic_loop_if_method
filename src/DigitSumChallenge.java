
public class DigitSumChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sumDigits(35525);
		System.out.println(result);
	}

	public static int sumDigits(int number) {
		if (number >= 10) {
			// n%10, n=n/10
			int sum = 0;
			while (number % 10 > 0) {
				sum += number % 10;
				number = number / 10;
			}
			return sum;
		} else {
			return -1;
		}
	}

}

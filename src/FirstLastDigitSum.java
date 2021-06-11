
public class FirstLastDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		result = sumFirstAndLastDigit(10);
		System.out.println(result);
	}

	public static int sumFirstAndLastDigit(int number) {
		if (number >= 0 && number < 10) {
			return (number * 2);
		} else if (number >= 0 && number >= 10) {
			while (number > 0) { // 252
				int lastDigit = number % 10;
				while (number > 0) {
					number = number / 10;
					if (number < 10) {
						int firstDigit = number % 10;
						int sum = firstDigit + lastDigit;
						return sum;
					}
				}

			}
		}

		return -1;
	}

}

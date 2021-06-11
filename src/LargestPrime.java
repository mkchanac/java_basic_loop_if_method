
public class LargestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLargestPrime(-1));

	}

	public static int getLargestPrime(int number) {
		int max_prime = -1;

		if (number <= 0) {
			return max_prime;
		}
		while (number % 2 == 0) {
			max_prime = 2;
			number = number / max_prime;
		}

		for (int i = 3; i <= Math.sqrt(number); i++) {
			while (number % i == 0) {
				max_prime = i;
				number = number / i;
			}
		}

		if (number > 2) {
			max_prime = number;
		}
		
		return max_prime;
	}

}

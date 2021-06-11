
public class EvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		result = getEvenDigitSum(-22);
		System.out.println(result);
	}

	public static int getEvenDigitSum(int number) {
		int sum = 0;
		if (number < 0) {
			return -1;
		} else {
			while (number > 0) { 
				if (number % 10 % 2 == 0) { 
					sum += number % 10; 
				}
				number = number / 10; 

			}
			return sum;
		}
	}

}

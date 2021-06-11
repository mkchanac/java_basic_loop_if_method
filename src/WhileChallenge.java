
public class WhileChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 4;
		int end = 20;
		int count = 0;
		while (number <= end) {
			number++;
			if (!isEvenNumber(number)) {
				continue;
			} 
			
			count++;
			System.out.println("Even number is " + number);
			if (count >= 5) {
				break;
			}
		}					
		System.out.println("Total number of even numbers found: " + count);

	}

	public static boolean isEvenNumber(int number) {
		if (number % 2 == 0)
			return true;
		else
			return false;
	}

}

import java.util.Scanner;
public class InputCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inputThenPrintSumAndAverage();
		
		
	}
	
	public static void inputThenPrintSumAndAverage() {
		int sum = 0;
		int count = 0;
		long average = 0L;
		double averageDouble;
		int number;
		Scanner input = new Scanner(System.in);
		
		while(true) {
		if (input.hasNextInt()) {
			number = input.nextInt();
			sum += number;
			count++;
			averageDouble = (double) sum / count;
			average = Math.round(averageDouble);
			input.nextLine();
		}
		else
			break;}
			System.out.println("SUM = " + sum + " AVG = " + average);
		
		
	}

}

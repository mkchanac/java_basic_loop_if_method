import java.util.Scanner;

public class MinAndMaxInputChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, number = 0;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Enter Number");

			if (input.hasNextInt()) {
				number = input.nextInt();
				if (number > max)
					max = number;
				if (number < min)
					min = number;

			} else
				break;
			input.nextLine();
		}

		System.out.println("Minimum number: " + min);
		System.out.println("Maximum number: " + max);

	}

}

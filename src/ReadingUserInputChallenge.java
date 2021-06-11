import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		int sum = 0;
		int number;
		boolean hasInteger = true;
		Scanner input = new Scanner(System.in);

		while (count <= 10) {
			System.out.println("Enter numbe #" + count + ": ");
			hasInteger = input.hasNextInt();

			if (hasInteger) {
				number = input.nextInt();
				count++;
				sum += number;
			} else {
				System.out.println("Invalid Number");
				input.nextLine();
			}

		}

		System.out.println(sum);
		

	}

}

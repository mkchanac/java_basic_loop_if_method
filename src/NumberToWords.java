
public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		System.out.println(getDigitCount(10000));
//		System.out.println(reverse(-121));
		numberToWords(1234);
		
	}

	public static void numberToWords(int number) { // 1234, 700
		int count = 0;
		count = getDigitCount(number); // 4, 3
		int value = reverse(number); // 4321, 007 (7)
		String words = "";
		int digit;
		digit = value % 10;
		if(number < 0)
			System.out.println("Invalid Value");
		for(int i = 0; i < count; i++) {
		switch(digit) {
		case 0:
			words += "Zero ";
			break;
		case 1:
			words += "One ";
			break;
		case 2:
			words += "Two ";
			break;
		case 3:
			words += "Three ";
			break;
		case 4:
			words += "Four ";
			break;
		case 5:
			words += "Five ";
			break;
		case 6:
			words += "Six ";
			break;
		case 7:
			words += "Seven ";
			break;
		case 8:
			words += "Eight ";
			break;
		case 9:
			words += "Nine ";
			break;
		}
		value = value /10;
		digit = value % 10;
		}
		System.out.println(words);
		

	}



	public static int getDigitCount(int number) { // 5200
		if (number < 0) {
			return -1; // 0/10 = 0, return1 === 123/1000 = 0, return3 === 5200/10000 = 0, return 4
		} else {
			int i = 1;
			while (number >= 0) {
				int result = (int) (number / Math.pow(10, i));
				if (result == 0)
					return i;
				else
					i++;
			}
			return -1;
		}
	}

	public static int reverse(int number) { // 1234
		int reverse = 0;
		int count = 0;

		if (number > 0)
			count = getDigitCount(number);
		else
			count = getDigitCount(number * -1);

		for (int i = (count - 1); i >= 0; i--) {
			reverse += (number % 10) * Math.pow(10, i);
			number = number / 10;
		}

		return reverse;

	}
}

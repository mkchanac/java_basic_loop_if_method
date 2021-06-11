
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getGreatestCommonDivisor(25,15));

	}

	public static int getGreatestCommonDivisor(int first, int second) {
		int div = 0;
		if (first < 10 || second < 10) { 
			return -1;
		} else {
			for (int i = 1; i <= first; i++) {
				for (int j = 1; j <= second; j++) {
					if (first % i == 0 && second % j == 0) {
						if (i == j)
							div = i;
					}
				}
			}
			return div;
		}
	}

}

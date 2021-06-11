
public class SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSharedDigit(12,13));
	}

	public static boolean hasSharedDigit(int x, int y) {
		if ((x >= 10 && x <= 99) && (y >= 10 && y <= 99)) {
		
				if(x % 10 == y % 10) {
					return true;
				}
				else if (x % 10 == y / 10) {
					return true;
				}
				else if (x / 10 == y / 10) {
					return true;
				}
				else if (x / 10 == y % 10) {
					return true;
				}
				else {
					return false;
				}
			

		} else
			return false;
	}

}

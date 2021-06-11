
public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 10, primeCnt = 0; i <= 50; i++) {
			
			if(isPrime(i)) {
				System.out.println(i + " is a prime number");
				primeCnt++;
				if(primeCnt==3) {
					System.out.println("Existing for loop");
					break;
				}
			}
			
		}

	}
	public static boolean isPrime(int n) {
		
		if(n==1) {
			return false;
		}
		for (int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		
		return true;
		
	}

}

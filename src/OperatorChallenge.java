
public class OperatorChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double var1 = 20.00d;
		double var2 = 80.00d;
		double result = (var1 + var2) * 100.00;
		double remainder = result % 40.00;
		boolean isRemainderZero = (remainder == 0);
		System.out.println(isRemainderZero);
		System.out.println(remainder);
		
		if (isRemainderZero == false)
			System.out.println("Got some remainder");
	}

}

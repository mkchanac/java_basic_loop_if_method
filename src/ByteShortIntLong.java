
public class ByteShortIntLong {
	public static void main(String[] args) 
	{
		byte numB = 100;
		short numS = 30000;
		int numI = 200000;
		long numL = 50000L + 10000000000L * (numB + numS + numI);
		
		System.out.println(numL);
		
		//Integer on the other hand is a Wrapper Class. 
		//By doing this that give us ways to perform 
		//operation on an integer type data.
		
	}
}

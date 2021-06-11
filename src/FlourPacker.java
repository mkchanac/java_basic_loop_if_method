
public class FlourPacker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canPack(2,10,18)); // 1,0,5 0,5,4 2,2,11 1,0,4
		// 1,0,4, ----- 5,3,24 ----- 2,1,5 ---- 2,2,12 --- 2,10,18  -- 6,2,17
	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		// big 5 kg, small 1kg, goal ? kg

		if (bigCount < 0 || smallCount < 0 || goal < 0)
			return false;

		if ((bigCount * 5 + smallCount) >= goal) {
			if(bigCount == 0)
				return true;
			else if (smallCount == 0 && goal % 5 == 0) 
				return true;
			else if (smallCount == 0 && goal % 5 != 0) 
				return false;
			else if ((goal - bigCount * 5) >= 0 && (smallCount >= (goal - bigCount * 5)))
				return true;
			else if ( (goal - bigCount * 5) < 0 && goal % 5 == 0)
				return true;
			else if ( (goal - bigCount *5) < 0 && smallCount >= (goal - (int)(goal / 5) * 5))
				return true;
			else 
				return false;		
			
		}
		else
			return false;
		
		
		
	}

}

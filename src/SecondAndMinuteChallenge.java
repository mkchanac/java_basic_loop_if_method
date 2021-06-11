
public class SecondAndMinuteChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		result = getDurationString(65,9);
		System.out.println(result);
		result = getDurationString(9567);
		System.out.println(result);

	}
	public static String getDurationString(int minutes, int seconds) {
		if(minutes < 0 || seconds < 0 || seconds > 59) {
			return "Invalid value";
		}
		else {
			int hrs,mins,sec;
			sec = seconds % 60;
			mins = minutes + seconds / 60;
			hrs = mins / 60;
			mins = mins % 60;
			
			String hrsString, minsString, secString;
			hrsString = hrs + "h ";
			minsString = mins + "m ";
			secString = sec + "s ";
			
			if (hrs < 10) {
				hrsString = "0" + hrsString;
			}
			if (mins < 10) {
				minsString = "0" + minsString;
			}
			if (sec < 10) {
				secString = "0" + secString;
			}
			
			return hrsString + minsString + secString;
		}	
	}
	public static String getDurationString(int seconds) {
		if(seconds < 0) {
			return "Invalid value";
		}
		else {
			int hrs,mins,sec;
			sec = seconds % 60;
			mins = seconds / 60;
			return getDurationString(mins,sec);
			
		}
	}

}

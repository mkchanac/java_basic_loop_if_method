
public class FeetInchCentimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double centimeter;

		centimeter = calcFeetAndInchesToCentimeters(5,13);
		System.out.println(centimeter);
		
		centimeter = calcFeetAndInchesToCentimeters(110);
		System.out.println(centimeter);

	}
	public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
		//1 inch = 2.54cm, 1 ft = 12 inches
		if(feet >= 0 && (inches >=0 && inches <=12)) {
			double cm;
			cm = feet * 12 * 2.54 + inches * 2.54;
			return cm;
		}
		else {
			return -1;
		}
	}
	public static double calcFeetAndInchesToCentimeters(int inches) {
		//1 inch = 2.54cm, 1 ft = 12 inches
		if(inches >= 0) {
			int feet;
			int inchesN;
			double cm;
			feet = (int) (inches / 12);
			inchesN = (int) (inches % 12);
			cm = calcFeetAndInchesToCentimeters(feet,inchesN);
			return cm;
		}
		else {
			return -1;
		}
	}

}

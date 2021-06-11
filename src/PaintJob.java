
public class PaintJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getBucketCount(2.75,3.25,2.5,1));
		System.out.println(getBucketCount(7.25,4.3,2.35));
		System.out.println(getBucketCount(3.26,0.75));
		
	}

	public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
		if (width <= 0 || height <= 0 || areaPerBucket <=0 || extraBuckets < 0)
			return -1;
		else {
			double area = width * height;
			double bucketsOfArea = area / areaPerBucket;
			int bucketsRequired = (int) Math.ceil(bucketsOfArea) - extraBuckets;
			return bucketsRequired;			
			
		}		
		
	}
	
	public static int getBucketCount (double width, double height, double areaPerBucket) {
		if (width <= 0 || height <= 0 || areaPerBucket <=0)
			return -1;
		else {
			double area = width * height;
			double bucketsOfArea = area / areaPerBucket;
			int bucketsRequired = (int) Math.ceil(bucketsOfArea);
			return bucketsRequired;			
			
		}		
		
	}
	public static int getBucketCount (double area, double areaPerBucket) {
		if (area <= 0 || areaPerBucket <=0)
			return -1;
		else {
			double bucketsOfArea = area / areaPerBucket;
			int bucketsRequired = (int) Math.ceil(bucketsOfArea);
			return bucketsRequired;			
			
		}		
		
	}

}

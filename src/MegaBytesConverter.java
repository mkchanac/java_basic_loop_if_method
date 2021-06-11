
public class MegaBytesConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMegaBytesAndKiloBytes(5000);
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		//1 MB = 1024 KB
		int mega;
		int remainKilo;
		if(kiloBytes >=0) {
		mega = kiloBytes / 1024;
		remainKilo = kiloBytes % 1024;
		System.out.println(kiloBytes + " KB = "+ mega + " MB and " + remainKilo +" KB");
		}
		else {
			System.out.println("Invalid Value");
		}
			
	}

}

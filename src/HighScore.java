import java.util.Scanner;
public class HighScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; 
		int position;
		int score;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the player name >> ");
		name = input.nextLine();
		System.out.print("Enter the player's score >> ");
		score = input.nextInt();
	
		position = calculateHighScorePosition(score);
		displayHighScorePosition(name, position);
	}
	
	public static void displayHighScorePosition(String name, int position) {
		System.out.println(name + " managede to get into position " 
				+ position + " on the high score table");
	}
	public static int calculateHighScorePosition(int score) {
		if (score > 1000) {
			return 1;
		}
		else if (score >= 500) {
			return 2;
		}
		else if (score >= 100) {
			return 3;
		}
		else {
			return 4;
		} 
		
	}
}

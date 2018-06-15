package Section5;

public class Vid28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// methods
		calculateScore(true, 5000, 8, 200);
		calculateScore(true, 10000, 5, 100);
		calculateScoreFalse(false, 10000, 5, 100);

	}

	public static void calculateScore(boolean gameOver, int score, int levelComleted, int bonues) {
		if (gameOver == true) {
			int finalScore = score + (levelComleted * bonues);
			System.out.println("Your final score was " + finalScore);
			
		}
	}
	
	public static int calculateScoreFalse(boolean gameOver, int score, int levelComleted, int bonues) {
		if (gameOver == true) {
			int finalScore = score + (levelComleted * bonues);
		
			return finalScore;
		}else {
			System.out.println("we returned negative");
			return -1;
			
		}
	}
}

package Section5;

public class Vid26 {
	public static void main(String[] args) {

		//code blocks
		boolean gameOver = true;
		int score = 5000;
		int levelComleted = 5;
		int bonues = 100;
		if(score==5000)
			System.out.println("Ur score was 5000");
		
		if(gameOver==true) {
			int finalScore = score + (levelComleted * bonues);
			System.out.println("Your final score was "+ finalScore);
			//if we try to use finalScore outside the if condition we get compilation error and 
			//thats because the variable belongs to that code block
		}
		score = 10000;
		levelComleted = 8;
		bonues = 200;
		
		if(gameOver==true) {
			int finalScore = score + (levelComleted * bonues);
			System.out.println("Your final score was "+ finalScore);
			//if we try to use finalScore outside the if condition we get compilation error and 
			//thats because the variable belongs to that code block
		}
	}
}

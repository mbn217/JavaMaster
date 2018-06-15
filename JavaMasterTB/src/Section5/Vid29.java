package Section5;

public class Vid29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method  challenge
		//bug to look for is in the if condition we need >= sign for the logic to be right
		int finalHighScorePositin = calculateHighScorePosition(1500);
		displayHightScoreposition("Mohamed",finalHighScorePositin);
		
		finalHighScorePositin = calculateHighScorePosition(900);
		displayHightScoreposition("Carol",finalHighScorePositin);
		
		finalHighScorePositin = calculateHighScorePosition(400);
		displayHightScoreposition("Sophia",finalHighScorePositin);
		
		finalHighScorePositin = calculateHighScorePosition(50);
		displayHightScoreposition("Mario",finalHighScorePositin);
		
	}
	
	
	public static void displayHightScoreposition(String playerName, int position){
		System.out.println("The player name "+ playerName+" managed to get into "+position
				+" position in the higher score table");
		
	}
	public static int calculateHighScorePosition(int playerScore) {
		
		if(playerScore>1000) {
			return 1;	
		}else if(playerScore>500 && playerScore<1000) {
			return 2;
		}else if(playerScore>100 && playerScore<500) {
			return 3;
		}else {
			return 4;
		}	
	}
	
	
	
	

}

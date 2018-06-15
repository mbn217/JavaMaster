package Section5;

import org.omg.CORBA.OMGVMCID;

public class Vid35 {
	public static void main(String[] args) {
		//method overloading
		
//		int ewScore = calculateScore("moahamed", 500);
//		System.out.println("new score is "+ ewScore);
//		System.err.println(calcFeetAndInchesToCentimeters(6, 2));
		calcFeetAndInchesToCentimeters(100);
		
	}
	//two param method
	 public static int calculateScore(String playerName, int score) {
		 System.out.println("Player " +playerName+" scored "+ score+" points");
		 return score*1000;
	 }
		//1 param method
	 public static int calculateScore(int score) {
		 System.out.println("no player scored "+ score+" points");
		 return 0;
	 }
		//no param method
	 public static void calculateScore() {
		 System.out.println("No player and no points");
	 }
	 
	 //++++++++++++++++++++++++++++++++++Challenge+++++++++++++++++++++++
	 
	 public static double calcFeetAndInchesToCentimeters(double inchesToFeet, double remainingInches){
		 if (inchesToFeet >= 0 && (remainingInches>=0 && remainingInches <= 12)) {
			double feetToCentimeters = ((inchesToFeet*12)*2.54);
			double inchesToCentimeters = (remainingInches*2.54);
			return feetToCentimeters +inchesToCentimeters;
		}
		 return -1;
	 }
	
	 public static double calcFeetAndInchesToCentimeters(int inches){
		 if (inches>=0) {
			double inchesToFeet = (int)inches/12;
			double remainingInches = (int) inches % 12 ; 
			System.out.println(inches+" inches is equal to "+ inchesToFeet+ " feet and "+ remainingInches+" inches");
			return calcFeetAndInchesToCentimeters(inchesToFeet, remainingInches);
		}
		 return -1;
	 }
	 
	 
}

package Section4;

 class Vid22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Operators
		int topScorer  = 95;
		int maxScore = 99;
		int secondTopScorer = 87;
		int score1 = 100;
		if(topScorer>90 && maxScore==100) System.out.println("Im the top scorer");
		if(topScorer<60 || secondTopScorer>80 ) System.out.println("Im the top scorer");;
		//myVariable = (testCondition) ? someValue : anotherValue;
		/**
		 * 
	    () holds the if
	    ? means then
	    : means else
	    if (testCondition) {
		    myVariable = someValue;
		} else {
		    myVariable = anotherValue;
		}
		 */
		int myPrint = (topScorer>90 && maxScore==100)?topScorer:secondTopScorer;
		float highestStudentGPA = 4.0f;
		float secondStudentGPA = 3.5f;
		float thirrdStudentGPA = 2.13f;
		boolean isPassOrNot;
		
		isPassOrNot = (highestStudentGPA>3.9)? true:false;
		System.out.println("The student with highest GPA will return true if pass and false if fail => "+ isPassOrNot);
		
		
	}

	
	
}

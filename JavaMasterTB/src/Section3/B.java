package Section3;

public class B implements MyInterface {

	
	public void calculateInterest(int savings, double rate) {
		System.out.println("Calculating interest inside A");
		double totalAfterInterest = savings*rate+1000;
		System.out.println("My savings after interest is "+ totalAfterInterest+" $");
	}
	
	public void printVal() {
		System.out.println("Printing Value inside Class B");
	}
}

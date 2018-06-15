package Section3;

public class A implements MyInterface {

	public void calculateInterest(int savings, double rate) {
		System.out.println("Calculating interest inside A");
		double totalAfterInterest = savings*rate;
		System.out.println("My savings after interest is "+ totalAfterInterest+" $");
	}
	
	public void printVal() {
		System.out.println("Printing Value inside Class A");
	}
}

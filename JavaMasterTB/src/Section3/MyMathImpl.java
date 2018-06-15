package Section3;

import java.util.regex.MatchResult;

public class MyMathImpl implements MyMath  {

	@Override
	public void add(int a, int b) {
		System.out.println("Add Result is: " + addPrivate( a,  b));
	}
 
	@Override
	public void subtract(int a, int b) {
		System.out.println("Subtract Result is: " + subtractPrivate( a,  b));
	}
	
	private int addPrivate(int a, int b) {
		return a+b;
	}
 
	private int subtractPrivate(int a, int b) {
		return a-b;
	}

}

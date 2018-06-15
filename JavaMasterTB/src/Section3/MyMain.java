package Section3;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		A a  = new A();
		b.printVal();
		a.printVal();
		b.calculateInterest(1000, 1.75);
		a.calculateInterest(1000, 1.75);
		
		//++++++++++++++++++++++++++++++
		first f = new first();
		f.getArea();
		//+++++++++++++++++++++++++++++
		MyMathImpl mymath = new MyMathImpl();
		mymath.add(4, 5);
		mymath.subtract(8, 6);
		
	}

}

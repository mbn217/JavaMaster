package Section6;

public class Vid43 {
	//For loops
	
	
	public static double calculateInterest(double amount , double interestRate) {
		return (amount *(interestRate/100));
	}
		
	public static boolean isPrime(int n) {
			if(n==1) {
				return false;
		}
			for (int i = 2; i <= n/2; i++) {
				if (n%i==0) {
					return false;
				}
			}
			return true;
	}
	
	public static void main(String[] args) {
		System.out.println("50000 at 2 % interest is  = "+ calculateInterest(50000, 2));
		System.out.println("10000 at 3 % interest is  = "+ calculateInterest(10000, 3));
		System.out.println("10000 at 1.75 % interest is  = "+ calculateInterest(10000, 1.75));
		System.out.println("100000 at 2 % interest is  = "+ calculateInterest(100000, 2));
	
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		for(int i = 0; i<5; i++) {
			System.out.println("Hello number = "+i);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		for(int i = 2; i<9; i++) {
			System.out.println("10000 at "+i+" % interest is  = "+ String.format("%.2f",calculateInterest(10000, i)));
		}
		System.out.println("++++++++++++++++Backward+++++++++++++++++++");
		for(int i = 8; i>=2; i--) {
			System.out.println("10000 at "+i+" % interest is  = "+ String.format("%.2f",calculateInterest(10000, i)));
		}
		System.out.println("++++++++++++++++isPrime+++++++++++++++++++");
		int count =0;
		for (int i = 10; i < 50; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println("The number "+i+" is a Prime number");
				if (count==10) {
					System.out.println("Exiting for loop because we reached 3 prime numbers");
					break;
				}
			}
		}
	}
}

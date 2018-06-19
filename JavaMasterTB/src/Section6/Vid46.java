package Section6;

public class Vid46 {
	//do while loop recap
	
	
	public static long addSquaresOfDigits(int number) {
	    long result = 0;
	    int tmp = 0;
	    while(number > 0) {
	        tmp = number % 10;
	        result += tmp * tmp;
	        number /= 10;
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		System.out.println(addSquaresOfDigits(100));
	}
}

package Section6;

public class Vid44 {
	//challenge

	public static boolean isOdd(int number) {
		if (number<0) {
			// negative number
			return false;
		}else {
			if (number%2!=0) {
				//number is even
				return true;
			}else {
				//number is not even
				return false;
			}
		}
	}
	
	public static int sumOdd(int start, int end) {
		int sum =0;
		if (end>=start && (start>0 && end>0)) {
			for (int i = start ; i <= end ;  i++) {
				if (isOdd(i)) {
					sum+=i;
				}
			}
			return sum;
		}
		
		return -1;

	}
	
	
	
	public static void main(String[] args) {
		int count=0;
		int total = 0;
		for (int i = 1; i <=1000; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("The number is "+ i);
				count++;
				total = total+i;
				if (count==5) {
					break;
				}
			}
		}
		System.out.println("The total of the sum is "+ total);	
		
		
		
		
		System.out.println("++++Another Challenge++++++\n");
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));
	}
}

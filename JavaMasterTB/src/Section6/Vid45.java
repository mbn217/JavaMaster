





package Section6;

public class Vid45 {
	//while//do while loop
	
	public static boolean isEvenNumber(int number) {
		if (number%2==0) {
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		int count =1;
		while (count!=6) {
			System.out.println("count value is "+ count);
			count++;
			
		}
		System.out.println("***************");
		count =1;
		while(true) {
			if (count==6) {
				break;
			}
			System.out.println("count value is "+ count);
			count++;
		}
		System.out.println("***************");
		//do while
		count=1;
		do {
			System.out.println("count value is "+ count);
			count++;
		} while (count!=6);
		System.out.println("*********Challenge******");
		System.out.println(isEvenNumber(22));
		System.out.println(isEvenNumber(223));
		System.out.println(isEvenNumber(1));
		//continue keyword
		int number =4;
		int finishNumber = 20;
		count=0;
		int sum=0;
		while (number<=finishNumber) {
			number++;
			if (!isEvenNumber(number)) {
				continue;//if it's not an even number continue the loop
			}
			count++;
			sum+=number;
			System.out.println("Even number "+ number);
			if (count==5) {
				break;
			}
		}
		System.out.println("Total of even number is "+ sum);
		
	}
}

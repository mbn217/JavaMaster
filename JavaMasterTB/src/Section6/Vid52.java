package Section6;

import java.util.Scanner;

public class Vid52 {
	//challenge
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		int min = 0;
		boolean first = true;
		while (true) {
			System.out.println("Enter number: ");
			boolean hasNumber = scanner.hasNextInt(); 
			if (hasNumber) {
				int number  = scanner.nextInt();
				if (first) {
					first = false;
					min = number;
					max = number;
				}
				if (number>max) {
					max = number;
				}
				if (number<min) {
					min = number;
				}
			}else {
				break;
			}
			scanner.nextLine();
		}
		System.out.println("min = "+ min+", max = "+max);
		scanner.close();
		
		
		
		
	}
}

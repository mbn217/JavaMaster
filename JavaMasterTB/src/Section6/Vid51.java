package Section6;

import java.util.Scanner;

public class Vid51 {

	public static void main(String[] args) {
		int num=1;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		while (num<10) {
			System.out.println("Enter number #"+num);
			num++;
			boolean isInteger = scanner.hasNextInt();
			if (isInteger) {
				int number = scanner.nextInt();
				sum+=number;
			}else {
				System.out.println("Invalid number");
			}
		}
		System.out.println("Sum is "+ sum);
		
		
		
		scanner.close();
		
		
		
		
	}
}

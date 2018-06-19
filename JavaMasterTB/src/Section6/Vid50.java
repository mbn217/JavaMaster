package Section6;

import java.util.Scanner;

public class Vid50 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your year of birth");
		boolean hasNextInt = scan.hasNextInt();
		
		if (hasNextInt) {
			int dateOfBirth = scan.nextInt();
			scan.nextLine();
			int age = 2018-dateOfBirth;
			System.out.println("Enter your name: ");
			String name = scan.nextLine();
			if (age>=0 && age<=100) {
				System.out.println("Your name is "+name+" and Your age is "+age);
			}else {
				System.out.println("Invalid year of birth");
			}
		}else {
			System.out.println("Invalid year and canot parse your entry");
		}
				
				
				

		
		


		
		scan.close();
		
	}
}

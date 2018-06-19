package Section6;

import java.util.Scanner;

public class Vid49 {
	//reading input from user
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Your name is "+name);
		System.out.println("Please enter your year of birth");
		int dateOfBirth = scan.nextInt();
		System.out.println("You were born in "+dateOfBirth);
		scan.close();
		
	}

}

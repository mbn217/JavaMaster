package Section9;

import java.util.Scanner;

public class Vid80 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		//readIntegers(6);
		System.out.println("The minimum value between all the values entered is: "+findMin(readIntegers(6)));
	}

	public static int[] readIntegers(int count) {
		int[] array  = new int[count];
		System.out.println("Please enter "+ count +" from the console:\r");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("The Value entered is : "+ array[i]);
		}
		return array;
	}
	
	public static int findMin(int[] array) {
		int temp = array[0];
		for (int i = 0; i < array.length-1; i++) {
			if (array[i]<temp) {
				temp = array[i]; 
			}
		}
		return temp;
	}
	
	
}

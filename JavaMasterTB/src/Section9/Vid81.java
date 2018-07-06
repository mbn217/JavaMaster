package Section9;

import java.util.Arrays;

public class Vid81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{7,5,6,9,8,1,44};
		System.out.println("Regular array before reverse is "+ Arrays.toString(arr));
		reverse(arr);
		System.out.println("array after reverse is "+Arrays.toString(arr));
	}

	
	
	public static void reverse(int[] myArray) {
		int maxIndex  = myArray.length-1;
		int halfLenght = myArray.length / 2;
		for (int i = 0; i < halfLenght; i++) {
			int temp  = myArray[i];
			myArray[i] = myArray[maxIndex-i];
			myArray[maxIndex-1] = temp;
		}
	}
	
	
}

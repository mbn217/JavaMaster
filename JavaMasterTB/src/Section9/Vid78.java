package Section9;

import java.util.Arrays;

public class Vid78 {
	public static void main(String[] args) {
		//reference type vs value type
		int[] array = new int[5];
		int[] mynumbers = {8,2,13,4,5,889};
		
		//+++++++++++++++++++++
		int[] myIntArray = new int[5];
		int[] anotherIntArray = myIntArray;
		System.out.println(" my int array = "+ Arrays.toString(myIntArray));
		System.out.println(" my another int array = "+ Arrays.toString(anotherIntArray));
		
		anotherIntArray[1]=55;
		System.out.println(" my int array = "+ Arrays.toString(myIntArray));
		System.out.println(" my another int array = "+ Arrays.toString(anotherIntArray));
		
	}

}

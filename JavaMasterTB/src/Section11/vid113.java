package Section11;

import java.util.ArrayList;
import java.util.Iterator;

public class vid113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> items = new ArrayList<>();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		//items.add("rrrr");
		items.add(5);
		printDouble(items);
		
	}

	private static void printDouble(ArrayList <Integer>  i) {
		for( int x:i) {
			System.out.println(x*2);
		}
		
	}

}

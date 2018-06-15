package Section6;

public class Vid40 {
	public static void main(String[] args) {
		int val =1;
		if (val==1) {
			System.out.println("Value is equal to 1");
		}else if (val==2) {
			System.out.println("Value is equal to 2");
		}else {
			System.out.println("Value is neither 1 or 2");
		}
		System.err.println("\n\n");
		int swtchVal =3;
		switch (swtchVal) {
		case 1:
			System.out.println("Value is equal to 1");
			break;
		case 2:
			System.out.println("Value is equal to 2");
			break;
		case 3: case 4: case 5:
			System.out.println("Value is equal to 3,4 or 5");
			break;
		default:
			System.out.println("Value is neither 1 or 2");
			break;
		}
		//+++++++++++++++cahllenge++++++++++++
		char character = 'E';
		
		switch (Character.toUpperCase(character)) {
		case 'C':
			System.out.println("The Character "+character+" is Found");
			break;
		case 'A':
			System.out.println("The Character "+character+" is Found");
			break;
		case 'B':
			System.out.println("The Character "+character+" is Found");
			break;
		case 'D':
			System.out.println("The Character "+character+" is Found");
			break;
		case 'E':
			System.out.println("The Character "+character+" is Found");
			break;
		default:
			System.out.println("The Characters A, B, C , D or E were not found");
			break;
		}
		
	}
}

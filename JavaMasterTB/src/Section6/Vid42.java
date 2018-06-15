package Section6;

public class Vid42 {
	public static void main(String[] args) {
		printNumberInWord(0);
		printNumberInWord(1);
		printNumberInWord(2);
		printNumberInWord(3);
		printNumberInWord(4);
		printNumberInWord(5);
		printNumberInWord(6);
		printNumberInWord(7);
		printNumberInWord(8);
		printNumberInWord(9);
		printNumberInWord(99);
		
		//+++++++++++++++++
		System.err.println(isLeapYear(-1600));
		System.err.println(isLeapYear(1600));
		System.err.println(isLeapYear(2017));
		System.err.println(isLeapYear(2000));
		System.err.println(isLeapYear(2020));
		
		//++++++++++++++++++++
		System.out.println(getDaysInMonth(1,2020));
		System.out.println(getDaysInMonth(2,2020));
		System.out.println(getDaysInMonth(2,2018));
		System.out.println(getDaysInMonth(-1,2020));
		System.out.println(getDaysInMonth(1,-2020));
	}

	public static void printNumberInWord(int number) {
		switch (number) {
		case 0:
			System.err.println("ZERO");
			break;
		case 1:
			System.err.println("ONE");
			break;
		case 2:
			System.err.println("TWO");
			break;
		case 3:
			System.err.println("THREE");
			break;
		case 4:
			System.err.println("FOUR");
			break;
		case 5:
			System.err.println("FIVE");
			break;
		case 6:
			System.err.println("SIX");
			break;
		case 7:
			System.err.println("SEVEN");
			break;
		case 8:
			System.err.println("EIGHT");
			break;
		case 9:
			System.err.println("NINE");
			break;
			
		default:
			System.err.println("OTHER");
			break;
		}
	}
	//+++++++++++++challenge number 2+++++++++++++++++=
	public static boolean isLeapYear(int year) {
		if (year>=1 && year<= 9999) {
			if ((year%4==0 && year%100!=0) || year%400==0) {
				return true;
			}
		}
		return false;	
	}
	
	
	public static int getDaysInMonth(int month, int year) {
		int returnedNumber = -1;
		if (month<1 || month>12) return -1;
		if (year<1 || year>9999) return -1;
	
		if (isLeapYear(year) == true) {
			switch (month) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				returnedNumber= 31;
				break;
			case 2:
				returnedNumber= 29;
				break;	
			case 4:case 6:case 9:case 11:
				returnedNumber= 30;
				break;	
			default:
				break;
			}
		}else {
			switch (month) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				returnedNumber= 31;
				break;
			case 2:
				returnedNumber= 28;
				break;	
			case 4:case 6:case 9:case 11:
				returnedNumber= 30;
				break;	
			default:
				break;
			}
		}
		
		return returnedNumber;
	
	}
	
	
	
	
	
	
	
}

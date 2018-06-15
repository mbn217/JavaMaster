package Section5;

public class Vid34 {
	public static void main(String[] args) {
		// checkNumber(0);
		// checkNumber(2);
		// checkNumber(-5);

		// coding exercises
		// public static void checkNumber(int number) {
		// if(number>0) {
		// System.out.println("positive");
		// }else if(number<0) {
		// System.out.println("negative");
		//
		// }else {
		// System.out.println("its a 0");
		// }
		// }
		// printMegaBytesAndKiloBytes(1000);
		// }
		// public static void printMegaBytesAndKiloBytes(int KiloByte){
		// //1024kb = 1mb
		// if (KiloByte<0) {
		// System.out.println("Invalid Value");
		// }else {
		// System.out.println(KiloByte+" KB = "+(KiloByte/1024)+" MB and
		// "+(KiloByte%1024)+" KB");
		// }
		//
		//
		// }

		//bark(true, 22);
//		double num1 = -3.1756;
//		double num2 = -3.175;
//		//System.out.println(isLeapYear(1800));
//		System.err.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//		
//		System.err.println((float)Math.floor(num1 * 1000));
//		System.out.println(Math.floor(num2 * 1000)/1000);
		

		
//		System.err.println(hasEqualSum(2, 2, 4));
//		System.err.println(hasEqualSum(2, 2, 5));
		
		
	}

//	public static boolean bark(boolean barking, int hourOfDay) {
//
//		if ((hourOfDay >= 0 && hourOfDay <= 23)) {
//			if ((hourOfDay < 8 || hourOfDay > 22) && barking) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	public static boolean isLeapYear(int year) {
		if (year>=1 && year<=9999) {
			if ((year%4==0) && (year%100!=0) || (year%400==0)) {
				return true;
			}
		}
		return false;
	}
	
	//++++++++++++++++++++++++++++++++
	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
		num1 = (int) Math.floor(num1 * 1000);
		num2 = (int) Math.floor(num2 * 1000);
		if(num1==num2) {
			return true;
		}
		return false;
	}
	
	
	//++++++++++++++++++++++++++++++++
	
	public static boolean hasEqualSum(int sum1,int sum2,int sum3) {
		
		if (sum1+sum2==sum3) {
			return true;
		}
		return false;
	}
	
	//++++++++++++++++++++++++++++++++	
	
	public static boolean hasTeen(int teen1, int teen2, int teen3) {
		if ((teen1>=13 && teen1<=19)||
			(teen2>=13 && teen2<=19)||
			(teen3>=13 && teen3<=19)) {
			return true;
		}
		return false;
		
	}
	

}

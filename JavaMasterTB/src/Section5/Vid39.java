package Section5;

public class Vid39 {
	public static void main(String[] args) {

		
		//area(55);
//		printYearsAndDays(561600);
//		printYearsAndDays(525600);
//		printYearsAndDays(1051200);
		
		//+++++
//		printEqual(1, 1, 1);
//		printEqual(1, 1, 2);
//		printEqual(-1,-1,-1);
//		printEqual(1, 2, 3);
		
		//++++++++
		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));
		
		
		
		
	}
	
	
	public static double area(double radius) {
		double area;
		final double PI = 3.14159;
		if (radius<0) {
			return -1.0;
		}
		area = radius * radius * PI;
		System.out.println("The area of a circle with "+ radius+" radius is equal to "+area );
		return area;
	}
	public static double area(double x, double y) {
		
		double areaOfRectangle;
		if ( (x<0 && y<0) || (x<0 || y<0) ) {
			return -1.0;
		}else {
			areaOfRectangle  = x * y; 
		}
		
		return areaOfRectangle;

	}
	
	//+++++++++++++++++++++++
	public static void printYearsAndDays(long minutes) {
		final String TXT = "Invalid Value";
		if (minutes<0) {
			System.err.println(TXT);
		}else {
			
			long totalYear = minutes / 525600;
			long remainingMinutes = minutes % 525600;
			long totalDays =  remainingMinutes / 1440;
			System.err.println(minutes+" min = "+totalYear+" y and "+totalDays+" d");

		}
	}
	//++++++++++++++++++++++++++++++++++++++++++++
	public static void printEqual(int p1, int p2, int p3) {
		final String TXT = "Invalid Value";
		if (p1<0 || p2<0 || p3<0 ) {
			System.out.println(TXT);
		}else if( p1==p2 && p2==p3) {
			System.out.println("All numbers are equal");
		}else if( p1!=p2 && p2!=p3 && p1!=p3) {
			System.out.println("All numbers are different");
		}else {
			System.out.println("Neither all are equal or different");
		}
	}
	
	//++++++++++++++++++++++++++++++++++++++++
	
	public static boolean isCatPlaying(boolean summer, int temprature) {
		if (((summer==false && ( temprature>=25 && temprature<=35)))
				|| summer==true && ( temprature>=25 && temprature<=45)) {
			return true;
		}
		return false;	
	}
	
}

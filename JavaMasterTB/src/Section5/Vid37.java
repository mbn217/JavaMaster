package Section5;

public class Vid37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//+++++++++++++Challenge++++++++++++++
		System.out.println(getDurationString(61, 50));
		
		
		
	}

	public static String getDurationString(int minutes, int seconds) {
		if (minutes>=0 && (seconds>=0 && seconds<=59)) {
			int hours = (minutes/60) ;
			int remainderMinutes = (minutes%60) ;
			return hours+ "h "+ remainderMinutes+"m "+seconds+"s";			
		}
		return "Invalid Value";
	}
	
	
	
	
}

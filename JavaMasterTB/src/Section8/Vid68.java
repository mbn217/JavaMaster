package Section8;

public class Vid68 {
	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("220B", "Dell", dimensions);
		
		
		Monitor monitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));
		MotherBoard motherboard =new MotherBoard("Bj-2--","Asus","4",6, "v2.44");
		
		PC thePC = new PC(theCase, monitor, motherboard);
		thePC.getMontior().drawPixelAt(1500, 2000, "Blue");
	
	
	
	
	
	
	}
}

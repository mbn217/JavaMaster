package Section8;

public class Vid69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");
		
		Ceiling ceiling = new Ceiling(12, 55);
		Bed bed = new Bed("Modern", 4, 3, 2, 1);
		Lamp lamp= new Lamp("classic", false, 75);
		Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		bedRoom.makeBed();
		bedRoom.getLamp().turnOn();
		
		
		
	}

}

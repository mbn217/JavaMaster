package Section7;

public class porshe extends Car1 {
	private int doors;
	public porshe(int speed, int gear, String typeOfSteering, String wheels, String size, int doors) {
		super(speed, gear, typeOfSteering, wheels, size);
		this.doors=doors;
	}

}

package Section7;

public class Car1 extends Vehicle {

	private String wheels;
	private String size;
	
	public Car1(int speed, int gear, String typeOfSteering, String wheels, String size) {
		super(speed, gear, typeOfSteering);
		this.wheels=wheels;
		this.size=size;
	}
	//@Override
//	public void move(int speed) {
//		System.out.println("The Vehicle is moving "+speed+"/h");
//		System.out.println("Car moves Very fast");
//	}
}

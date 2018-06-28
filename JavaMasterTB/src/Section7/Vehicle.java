package Section7;

public class Vehicle {

	private int speed; //to be used in the moving()
	private int gear; //to be used changingGear()
	private String typeOfSteering; // steering type sport or regular depending on the car type
	
	//constructor
	public Vehicle(int speed , int gear, String typeOfSteering) {
		this.speed=speed;
		this.gear=gear;
		this.typeOfSteering=typeOfSteering;
	}
	//Methods
	public void move(int speed) {
		System.out.println("The Vehicle is moving "+this.speed+"/h");
	}
	public void changingGear(int gear) {
		System.out.println("Changing to"+this.gear+" gear");
	}
}

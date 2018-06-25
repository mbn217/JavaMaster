package Section7;

public class Car {

	//variable created in the class are member variables/fields
	//we use private as access identifier for encapsulation( to not allwo outside access to these variables)
	//variables are the charectistique //state component of the car
	private int doors;
	private int wheels;
	private String model;
	private String colour;
	//constructor
	public Car(int door, int wheels, String model, String colour) {
		this.doors=door;
		this.wheels=wheels;
		this.model=model;
		this.colour=colour;
	}
	
	
	public int getDoors() {
		return doors;
	}


	public int getWheels() {
		return wheels;
	}


	public String getColour() {
		return colour;
	}


	//getters and setters
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return this.model;
	}
	
	
}

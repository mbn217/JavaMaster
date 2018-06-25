<<<<<<< HEAD
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
=======
package Section7;

public class Car {
	private int doors;//fields// charecteristiqyue of the car
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if (validModel.equals("carrera") || validModel.equals("hornendo") ) {
			this.model = model;	
		}else {
			this.model = "Unkown model";
		}
		
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	
	
}
>>>>>>> branch 'master' of https://github.com/mbn217/JavaMaster.git

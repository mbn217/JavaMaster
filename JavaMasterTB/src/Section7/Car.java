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

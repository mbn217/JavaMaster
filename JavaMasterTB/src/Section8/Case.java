package Section8;

public class Case {
	private String model;
	private String manufacturer;
	private Dimensions dimensions;
	public Case(String model, String manufacturer, Dimensions dimensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.dimensions = dimensions;
	}
	
	
	
	public void pressPowerButton() {
		System.out.println("Power Button pressed");
		
		
	}



	public String getModel() {
		return model;
	}



	public String getManufacturer() {
		return manufacturer;
	}



	public Dimensions getDimensions() {
		return dimensions;
	}
	
	
	
}

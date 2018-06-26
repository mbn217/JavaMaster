package Section8;

public class MotherBoard {
	private String model;
	private String manufacturer;
	private String ramSlots;
	private int cardSlots;
	private String bios;
	public MotherBoard(String model, String manufacturer,String ramSlots,  int cardSlots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getRamSlots() {
		return ramSlots;
	}
	public int getCardSlots() {
		return cardSlots;
	}
	public String getBios() {
		return bios;
	}
	
	
	
	
	
	
	
	
}

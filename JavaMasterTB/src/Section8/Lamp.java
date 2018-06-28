package Section8;

public class Lamp {
	private String style;
	private boolean battery;
	private int globaRating;
	/**
	 * @param style
	 * @param battery
	 * @param globaRating
	 */
	public Lamp(String style, boolean battery, int globaRating) {
		super();
		this.style = style;
		this.battery = battery;
		this.globaRating = globaRating;
	}
	public String getStyle() {
		return style;
	}
	public boolean isBattery() {
		return battery;
	}
	public int getGlobaRating() {
		return globaRating;
	}
	public void turnOn() {
		System.out.println("Lamp --> turning on");
	}
}

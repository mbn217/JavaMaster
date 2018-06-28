package Section8;

public class Bed {
	private String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilts;
	/**
	 * @param style
	 * @param pillows
	 * @param height
	 * @param sheets
	 * @param quilts
	 */
	public Bed(String style, int pillows, int height, int sheets, int quilts) {
		super();
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilts = quilts;
	}
	public String getStyle() {
		return style;
	}
	public int getPillows() {
		return pillows;
	}
	public int getHeight() {
		return height;
	}
	public int getSheets() {
		return sheets;
	}
	public int getQuilts() {
		return quilts;
	}
	
	public  void make() {
		System.out.println("Bed --> Making");
	}
	
}

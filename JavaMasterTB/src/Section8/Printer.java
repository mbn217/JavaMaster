package Section8;

public class Printer {

	private int tonerLevel;
	private int numberOfPagesPrinted;
	private boolean isDuplex;
	/**
	 * @param tonerLevel
	 * @param numberOfPagesPrinted
	 * @param isDuplex
	 */
	public Printer(int tonerLevel, boolean isDuplex) {
		super();
		if (tonerLevel>-1 && tonerLevel<=100) {
			this.tonerLevel = tonerLevel;
		}else {
			this.tonerLevel = -1;
		}
		
		this.isDuplex = isDuplex;
		this.numberOfPagesPrinted=0;
	}
	public int getTonerLevel() {
		return tonerLevel;
	}
	public int getNumberOfPagesPrinted() {
		return numberOfPagesPrinted;
	}
	public boolean isDuplex() {
		return isDuplex;
	}
	
	public int fillUpToner(int tonerAmount) {
		if (tonerAmount>0 && tonerAmount<=100) {
			if (this.tonerLevel + tonerAmount>100) {
				return -1;
			}
			this.tonerLevel+=tonerAmount;
			return this.tonerLevel;
		}else {
			return -1;
		}
	}
	
	public int printPages(int pages) {
		int pagesToPrint = pages;
		if (this.isDuplex) {
			pagesToPrint/=2;
			System.out.println("Printing in duplex mode");
		}
		this.numberOfPagesPrinted+=pagesToPrint;
		return pagesToPrint;
	}
	
	
	
	
}

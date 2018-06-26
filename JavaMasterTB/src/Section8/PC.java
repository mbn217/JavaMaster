package Section8;

public class PC {
	private Case theCase;
	private Monitor montior;
	private MotherBoard motherBoard;
	public PC(Case theCase, Monitor montior, MotherBoard motherBoard) {
		super();
		this.theCase = theCase;
		this.montior = montior;
		this.motherBoard = motherBoard;
	}
	public Case getTheCase() {
		return theCase;
	}
	public Monitor getMontior() {
		return montior;
	}
	public MotherBoard getMotherBoard() {
		return motherBoard;
	}
	
	
}

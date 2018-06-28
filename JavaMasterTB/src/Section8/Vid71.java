package Section8;

public class Vid71 {
	public static void main(String[] args) {
		Printer printer = new Printer(50, true);
		System.out.println("Initial page count = " + printer.getNumberOfPagesPrinted());
		int pagespinted = printer.printPages(4);
		System.out.println("new total "+ printer.getNumberOfPagesPrinted());
	}
}
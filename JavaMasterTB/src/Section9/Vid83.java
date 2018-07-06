package Section9;

import java.util.Scanner;

public class Vid83 {
	private static Scanner scanner  = new Scanner(System.in);
	private static Grocery groceryList = new Grocery();
	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstruction();
		while (!quit) {
			System.out.println("Enter your choices: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 0:
				printInstruction();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
				
			case 3:
				modifyItem();
				break;				
			case 4:
				removeItem();
				break;
			case 5:
				searachforItem();
				break;					
			case 6:
				quit = true;
				break;
			}
		}
	}
	private static void searachforItem() {
		// TODO Auto-generated method stub
		System.out.print("Item to search for: ");
		String searchItem = scanner.nextLine();
		if (groceryList.findItem(searchItem)!=null) {
			System.out.println("Found "+ searchItem+" in our grocery list");
		}else {
			System.out.println(searchItem+" in not in our grocery list");
		}
	}
	private static void removeItem() {
		// TODO Auto-generated method stub
		System.out.print("Enter item number ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(itemNo);
	}
	private static void modifyItem() {
		// TODO Auto-generated method stub
		System.out.print("Enter item number ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter replacement item:  ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryList(itemNo-1, newItem);
		
	}
	private static void addItem() {
		System.out.print("Please enter the grocery item ");
		groceryList.addGroceryItem(scanner.nextLine());
		
	}
	private static void printInstruction() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options. ");
		System.out.println("\t 1 - To print the list of grocery items ");
		System.out.println("\t 2 - To add an item to the list ");
		System.out.println("\t 3 - To mopdify an item in the list ");
		System.out.println("\t 4 - To remove an item from the list ");
		System.out.println("\t 5 - To search for an item in the list ");
		System.out.println("\t 6 - To quit the application ");
		
	}
}

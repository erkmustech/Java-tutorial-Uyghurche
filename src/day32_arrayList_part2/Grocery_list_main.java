package day32_arrayList_part2;

import java.util.Scanner;

public class Grocery_list_main {
	
	static GroceryList gl=new GroceryList();
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		printInstruction();
		boolean quit = false;
		
	while(!quit) {
			System.out.print("please inter your choice!");

			int n=sc.nextInt();
			
			switch (n) {
			case 0:
				printInstruction();
				break;
			case 1:
				printGroceryList();
				break;
			case 2:
				modify();
				break;
			case 3:
				remove();
				break;
			case 4:
				search();
				break;
			case 5:
				quit=true;
				break;
			default:
				System.out.println("invalid number");
				break;
		
	        }
		}
	}
	public static void printInstruction() {
	
	System.out.println("\n press :");
	System.out.println("\t 0 -  to print the list of the grocery items ");
	System.out.println("\t 1 -  to add the grocery items ");
	System.out.println("\t 2 - to modify an item ");
	System.out.println("\t 3 - to remove the item");
	System.out.println("\t 4 - to search the item");
	System.out.println("\t 5 - to quit the item");
	}

	private static void remove() {
		System.out.println("item romoved");
	}

	private static void quit() {
		System.out.println("quited");
		
	}

	private static void search() {
		System.out.println(" search the item");		
	}

	private static void modify() {
		System.out.println("item modified");		
	}

	private static void addItem() {
      System.out.println("inter your grocery item");

       
	}

	private static void printGroceryList() {
		System.out.println("your grocery list is ----");
		
	}
}


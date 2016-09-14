/**Nick Lemiesz & Sam Shrimpton
 * 9/18/16
 * Lab 1: Grocery Bag Sorter 
 * 
 * Sorts items that the user has bought into bags based on different parameters, such as item weight, size, sturdiness, etc.
 * Utilizes bags, linkedBags and nodes to store multiple different types of data at once.
 */

package Bags;

import java.util.Scanner;

public class Lemiesz_Shrimpton_Lab1_Grocery_Sorter {

	public static void main(String[] args) {
		//Initialize variables 
		int itemCount = 1;
		int totalWeight = 0;
		int totalItems = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many items?: ");
		totalItems = input.nextInt();
		
		//If the user does not input any items
		if (totalItems == 0){
			System.out.println("No items added. Program end.");
		}
		
		//Runs the loop for each item until the itemCount is equal to the totalItems
		while (itemCount <= totalItems) {
			//Continuously counts items until none are left, specified by the user 
			System.out.println("List item # " + itemCount);
			
			//Asks user for weight of item and adds it to the total weight
			System.out.print("List weight: " );
			int Weight = input.nextInt();
			totalWeight += Weight;
			
			//Asks user for size of item
			System.out.print("List size (small/medium/large): " );
			String answer = input.next();
			String Size = checkSize(answer);
			
			//Asks user if item is raw meat
			//System.out.print("Is the item raw meat?: ");
			//String answer = input.next();
			//boolean raw = checkBool(answer);
			//if (raw == true) {
			
			
			//Asks user if item is sturdy (boxes, cans,etc.)
			System.out.print("Is the item sturdy?: " );
			answer = input.next();
			boolean sturdy = checkBool(answer);
			
			if (!sturdy) {
				//Asks user if item is fragile (produce, meats, etc.)
				System.out.print("Is the item fragile?: " );
				answer = input.next();
				boolean fragile = checkBool(answer);	
			}
			
			System.out.println("");
			itemCount++;
		}//end while loop
		
		System.out.println("Total weight of items: " + totalWeight);
		System.out.println("Total # of bags: ");
		
		
	}//end Main
	
	//Boolean check method: checks if the user inputs a 'y' for yes, otherwise assumed to be no
	private static boolean checkBool (String s) {
		if (s.contains("y") || s.contains("Y")) {
			return true;
		}
		else {
			return false;
		}
	}//end boolCheck
		
	//Size check method: checks is user starts the string with: 
	//	's' = small, 
	//	'm' = medium, or 
	//	'l' = large, 
	//otherwise assumed to be a large object
	private static String checkSize (String s) {
		String Size;
		if (s.startsWith("s") || s.startsWith("S")) {
			Size = "small"; 
			return Size;
		}
		
		else if (s.startsWith("m") || s.startsWith("M")) {
			Size = "medium"; 
			return Size;
		}
		
		else if (s.startsWith("l") || s.startsWith("L")) {
			Size = "large"; 
			return Size;
		}
		
		else {
			Size = "large"; 
			return Size;
		}
	}//end sizeCheck

}

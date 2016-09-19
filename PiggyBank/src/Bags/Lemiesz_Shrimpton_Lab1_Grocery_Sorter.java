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
		int totalBags = 0;

		int weight;
		String size;
		boolean sturdy;
		boolean fragile;

		Scanner input = new Scanner(System.in);

		System.out.print("How many items?: ");
		totalItems = input.nextInt();

		//If the user does not input any items
		if (totalItems == 0){
			System.out.println("No items added. Program end.");
		}
		else {
			//Runs the loop for each item until the itemCount is equal to the totalItems
			do {
				//Continuously counts items until none are left, specified by the user 
				System.out.println("List item # " + itemCount);


				//Asks user for weight of item and adds it to the total weight
				System.out.print("List weight: " );
				weight = input.nextInt();
				totalWeight += weight;


				//Asks user for size of item
				System.out.print("List size (small/medium/large): " );
				String answer = input.next();
				size = checkSize(answer);


				//Asks user if item is sturdy (boxes, cans,etc.)
				System.out.print("Is the item sturdy?: ");
				answer = input.next();
				sturdy = checkBool(answer);

				//If the user says the item is sturdy, skip the fragile question, otherwise ask it 
				if (!sturdy) {
					//Asks user if item is fragile (produce, meats, etc.)
					System.out.print("Is the item fragile?: " );
					answer = input.next();
					fragile = checkBool(answer);	
				}
				else {
					fragile = false;
				}

				//Makes a new item given the parameters
				Grocery_Item item = new Grocery_Item(weight, size, sturdy, fragile);


				//Make a bag
				LinkedBag<Grocery_Item> bag = new LinkedBag<Grocery_Item>(); 
				
				bag.add(item);

				System.out.println("");
				itemCount++;
				totalBags++;
			} while(itemCount <= totalItems); //end do-while loop
			
			System.out.println("Bagging complete.");
			System.out.println("Total weight of items: " + totalWeight);
			System.out.println("Total # of bags: " + totalBags);
		}//end else 
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

	public static boolean compareSturdy(Grocery_Item i1, Grocery_Item i2) {
		//If item 1 is more sturdy than the item 2
		if ((i1.getSturdy() == true) && (i2.getSturdy()== false) || (i1.getSturdy() == false) && (i2.getFragile()== true)) {
			return true;
		}

		//If item 1 is less sturdy than item 2
		else if ((i1.getSturdy() == false) && (i2.getSturdy()== true) || (i1.getFragile() == true) && (i2.getSturdy()== false)) {
			return false;
		}

		//If both items are as sturdy as one another
		else {
			return false;
		}
	}//compareSturdy
}

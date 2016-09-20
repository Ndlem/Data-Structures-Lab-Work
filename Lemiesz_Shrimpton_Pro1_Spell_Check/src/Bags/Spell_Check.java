package Bags;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Spell_Check {

	public static <T> void main(String[] args) throws IOException {
		int wrongCheck = 0;
		String word;

		LinkedBag<String> dicBag = new LinkedBag<>(); 

		try {
			//Create reader for dictionary file
			BufferedReader d_read = new BufferedReader(new FileReader("english3.txt"));

			while((word = d_read.readLine()) != null) {				//while there are still words available
				dicBag.add(word);					//add word to dictionary bag 
				//System.out.println(word + " was added.");
			}
			d_read.close();

		} catch (FileNotFoundException e) {
			System.out.println("Dictionary file not found. Program terminated."); 
			System.exit(0);
		}


		try{
			//Create scanner for file to be checked
			Scanner w_scan = new Scanner(new File("Words_to_Check"));
			String testWord; 

			while(w_scan.hasNext()){
				testWord = w_scan.next().toLowerCase();
				if (dicBag.contains(testWord)) {
					System.out.println("'" + testWord + "'found.");
				}	
				else {
					System.out.println("'" + testWord + "'NOT found.");
					wrongCheck++;
				}
			}
			w_scan.close();

			System.out.print("Spell check of selected document done. ");
			System.out.print("Found " + wrongCheck);
			if (wrongCheck == 1) {
				System.out.println(" error.");
			}
			else {
				System.out.println(" errors.");
			}

			//If file to check not found, end program	
		} catch (FileNotFoundException e) {
			System.out.println("File to check not found. Program terminated.");
			System.exit(0);
		}

		//If dictionary file to check not found, end program

	}

}

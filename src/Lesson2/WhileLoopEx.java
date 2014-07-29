package Lesson2;

import java.util.Scanner;

public class WhileLoopEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean cont = true;
		
		Scanner input = new Scanner(System.in);
		double far = 0.0;
		double cel = 0.0;
		String ans = "Y";
		
		System.out.println("Welcome to temperature converter!");
		System.out.println("=================================");
		
		while(cont) {
			System.out.print("Enter Farenheit: ");
			far = input.nextDouble();
			cel = (far - 32.0) * 5.0/9.0;
			System.out.format("%.3f F is %.3f C\n", far, cel);
			System.out.println("Continue?(yes/no)");
			ans = input.next();
			
			if(ans.equalsIgnoreCase("yes")) {  //logical error
				cont = true;
			} else if(ans.equalsIgnoreCase("no")) { 
				cont = false;
			} else {
				boolean keepAsking = true;
				System.out.print("What? ");
				
				while( keepAsking ) {
					ans = input.next();
					if(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no")) {
						keepAsking = false;
					} else {
						keepAsking = true;
						System.out.print("Say again? ");						
					}
				}	
				if(ans.equalsIgnoreCase("yes")) {  
					cont = true;
				} else if(ans.equalsIgnoreCase("no")) { 
					cont = false; 
				}
				
			}
		}
		System.out.println("Bye");

	}

}

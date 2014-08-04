
package Lesson2;

import java.util.Scanner;

public class IfElse {
	
	/**
	 * Get input
	 * if an input number is an odd number then print Llama
	 * else if an input number is an even number then print Duck
	 * else if an number  is 0 then exit
	 * if 0 is input, say "Bye" and leave 
	 * to find even and odd: modular operation, %
	 * ex) 5%2 == 1, 6%2 == 0
	 * 
	 * assume only enter int
	 * 
	 * while loop
	 * use while loop and if else, else if 
	 * 
	 * 
	 */
	
	public static void main(String[]args) {
		boolean flag = true;

		Scanner num = new Scanner(System.in);
		
		while(flag) {
			System.out.print("Enter Number: ");
			double input = num.nextDouble();
			if(input == 0) {
				System.out.print("Bye");
				System.exit(0);	
			} else if(mod(input,1) > 0) {
				System.out.println("Please enter an integer");
			} else if(mod(input,1) == 0) {
				double evenOdd = mod(input,2);
				if(evenOdd == 0) {
					//input is even
					System.out.println("Duck");
				} else { //if (evenOdd == 1) {
					//input is odd
					System.out.println("Llama");
				}
			} else {
				System.out.println("Errorneous situation!");
			}
			
		}
		
	}
	public static double mod(double a, double b){
        return a%b;
	}
}
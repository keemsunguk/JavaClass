package Lesson2;

import java.util.Scanner;

public class ConditionalEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean haveMoney, feelGood;
		String ans = "y";
		boolean flag = true;
		
		Scanner input = new Scanner(System.in);
	
		while(flag) {
			System.out.print("Do you have lots of money? ");
			ans = input.next();
			
			if(ans.equalsIgnoreCase("yes")) {
				haveMoney = true;
			} else if (ans.equalsIgnoreCase("no")) {
				haveMoney = false;
			} else {
				haveMoney = false;
				flag = false;
			}
			
			System.out.print("Do you feel good? ");
			ans = input.next();
			
			if(ans.equalsIgnoreCase("yes")) {
				feelGood = true;
			} else if(ans.equalsIgnoreCase("no")) {
				feelGood = false;
			} else {
				feelGood = false;
				flag = false;
			}

			if(haveMoney && feelGood) {
				System.out.println("Buy a car");
			} else if (haveMoney) {
				System.out.println("Buy Pepsi");				
			} else if (feelGood) {
				System.out.println("Sing a song");
			} else {
				System.out.println("Study...");
			}
			
			if(haveMoney || feelGood) { 
				System.out.println("Sing a song or buy Pepsi");
			}
		}
		System.out.println("End...");

	}

}

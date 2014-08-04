package Lesson3;

import java.util.Scanner;

public class SwichEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int i = input.nextInt();
		
		switch (i) {
			case 1:  {
				int j = 10;
				System.out.println(i*j);
				break;
			}
			case 2: {
				int j = 20;
				System.out.println(i*j);
				break;
			}
			case 3: 
				System.out.println("30");
				break;
			case 4: 
				System.out.println("40");
				break;
			case 5: 
				System.out.println("50");
				break;
			case 6: 
				System.out.println("60");
				break;
			case 7: 
				System.out.println("70");
				break;
			case 8: 
				System.out.println("80");
				break;
			case 9: 
				System.out.println("90");
				break;
			default:  {
				System.out.println("0");
				break;	
			}
		}
	}

}

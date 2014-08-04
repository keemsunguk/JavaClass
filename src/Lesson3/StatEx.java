package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class StatEx {
	public static void main(String []args) {
		boolean flag = true;
		//array input
		Scanner input = new Scanner (System.in);
		while(flag){
		//number of data in array
			System.out.print("How many numbers to input? ");
			int inputnum = input.nextInt();
			
			double arrayA[] = new double[inputnum];
			
			System.out.println("Enter data(numbers)");
			//data in array
			for (int i = 0; i < arrayA.length; i++) {
				arrayA[i] = input.nextDouble();
			}
			
			//verifies and prints stored data
			System.out.println("Stored");
			System.out.println(Arrays.toString(arrayA));
			
			//choose user option
			Scanner option = new Scanner (System.in);
			System.out.println("Enter option: sum, mean, stdev OR quit to exit");
			//sum
			double sum = 0;
			for (int i = 0; i < arrayA.length; i++) {
				sum = sum + arrayA[i];
			}
			//mean
			double mean = sum/arrayA.length;
			//stdev
				//prevariance is sum of (array-mean)^2
				double prevariance = 0;
				for (int i = 0; i < arrayA.length; i++) {
					prevariance = Math.pow(arrayA[i] - mean, 2) + prevariance;
				}
				//variance is sum((array-mean)^2)/array length
				double variance = prevariance/arrayA.length;
				double stdev = Math.sqrt(variance);
			
			//actions
			String usercalc = option.nextLine();
			if (usercalc.equalsIgnoreCase("sum")){
				System.out.println(sum);
			}
			else if (usercalc.equalsIgnoreCase("mean")){
				System.out.println(mean);
			}
			else if (usercalc.equalsIgnoreCase("stdev")){
				System.out.println(stdev);
			}
			else if (usercalc.equalsIgnoreCase("quit")) {
				System.out.print("Bye");
				System.exit(0);
			}
			
			
/*		String useroption = option.nextLine();
		if (useroption.equalsIgnoreCase("sum")){
			double sum = 0;
			for (int i = 0; i < arrayA.length; i++) {
				sum = sum + arrayA[i];
				}
		System.out.println("The sum is: "+ sum);
		}
		else if (useroption.equalsIgnoreCase("mean")){
			double sum = 0;
			for (int i = 0; i < arrayA.length; i++) {
				sum = sum + arrayA[i];
			}
			double mean = sum/arrayA.length;
		System.out.println("The mean is: "+ mean);
		}
		else if (useroption.equalsIgnoreCase("stdev")){
			double sum = 0;
			for (int i = 0; i < arrayA.length; i++) {
				sum = sum + arrayA[i];
				double mean = sum/arrayA.length;
				double variance = (Math.pow((arrayA[i]-mean), 2))/arrayA.length;
				System.out.print(variance);
			}
	*/
			
					
		}
		}
}
		
		


	


	
	

		
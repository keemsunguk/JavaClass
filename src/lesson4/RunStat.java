package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class RunStat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("How many numbers to input? ");
		int array_size = input.nextInt();
		
		double data[] = new double[array_size];
		double sdata[] = null;
		
		for(int i = 0; i < array_size; i++) {
			data[i] = Math.random()*100;
		}
		System.out.print("Stored Data: ");
		System.out.println(Arrays.toString(data));
		
		StatEx statObj = new StatEx(data);
		System.out.format("The sum is: %5.2f\n", statObj.getSum());
		System.out.format("The Mean is: %5.2f\n", statObj.getMean());
		
		System.out.format("The Stdev is: %5.2f\n", statObj.getStdev());
		System.out.println("Sorted Data: ");
		sdata = statObj.sortData();
//		System.out.println(Arrays.toString(sdata));
		
		for(int j = 0; j < array_size; j++) {
			System.out.format("[%3d] = %4.2f\n", j, sdata[j]);
		}
		
//		qsData = statObj.QuickSort();
	}

}

package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

import lesson4.StatEx;

public class RunQuickSort {

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
		System.out.println("Stored Data: ");
		for(int j = 0; j < 10; j++) {
			System.out.format("[%3d] = %4.2f\n", j, data[j]);
		}
		System.out.println("...... ");
		
		MyQuickSort myQs = new MyQuickSort(data);

		sdata = myQs.QuickSort();
		
		for(int j = 0; j < array_size; j++) {
			System.out.format("[%3d] = %4.2f\n", j, sdata[j]);
		}
		
//		qsData = statObj.QuickSort();

	}

}
